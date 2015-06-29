package com.kot32.warmenglish.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.ClassDAO;
import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Message;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;

@Service
public class ClassService {
	@Autowired
	ClassDAO classDAO;
	@Autowired
	ClassDAO groupDAO;
	@Transactional
	public boolean addClass(User teacher,com.kot32.warmenglish.domain.Class c){
		return classDAO.addClass(teacher,c);
	}
	
	@Transactional
	public List  listClass(User teacher){
		return classDAO.listClass(teacher);
	}
	@Transactional
	public void deleteClass(String class_id) {
		// TODO Auto-generated method stub
		classDAO.deleteClass(class_id);
	}
	@Transactional
	public void addGroup(String class_uuid, String name, String tips) {
		// TODO Auto-generated method stub
		classDAO.addGroup(class_uuid,name,tips);
	}
	@Transactional
	public List<Group> listGroup(String clazz) {
		// TODO Auto-generated method stub
		return classDAO.listGroup(clazz);
	}
	@Transactional
	public List<Group> listAllGroup(User teacher){
		return groupDAO.listAllGroup(teacher);
	}
	@Transactional
	public List<Student> list_members(int group_id){
		return groupDAO.list_members(group_id);
	}
	@Transactional
	public List<Student> list_unmembers(int clazz_id){
		return groupDAO.list_unmembers(clazz_id);
	}
	@Transactional
	public void delete_members(int[] student_id,int clazz_id){
		groupDAO.delete_members(student_id,clazz_id);
	}
	@Transactional
	public void add_members(int[] student_id,int group_id){
		groupDAO.add_members(student_id,group_id);
	}
}
