package com.kot32.warmenglish.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.APPDAO;
import com.kot32.warmenglish.dao.HomeworkDAO;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.UserException;
@Service
public class HomeworkService {
	@Autowired
	HomeworkDAO HomeworkDAO;
	
	@Transactional
	public boolean addHomework(String des,String group_id) {
		return HomeworkDAO.addHomework(des, group_id);
	}
	@Transactional
	public String listClasses() {
		return HomeworkDAO.listClasses();
	}
	@Transactional
	public ArrayList<com.kot32.warmenglish.domain.appPojo.Group> listGroups(int class_id) {
		// TODO Auto-generated method stub
		return HomeworkDAO.listGroups(class_id);
	}
	
}
