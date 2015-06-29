package com.kot32.warmenglish.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.APPDAO;
import com.kot32.warmenglish.dao.HomeworkDAO;
import com.kot32.warmenglish.domain.EssayAnswer;
import com.kot32.warmenglish.domain.Grade;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Homework;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.UserException;
@Service
public class HomeworkService {
	@Autowired
	HomeworkDAO HomeworkDAO;
	
	@Transactional
	public String addHomework(String des,String group_id) {
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
	@Transactional
	public void addSelectProbelm(String homework_uuid, String tigan, String a,
			String b, String c, String d, String rightAnswer) {
		// TODO Auto-generated method stub
		HomeworkDAO.addSelectProbelm(homework_uuid,tigan,a,b,c,d,rightAnswer);	
	}
	@Transactional
	public boolean addRead(String homework_uuid,String content,HttpServletRequest req) {
		// TODO Auto-generated method stub
		boolean isSuccess=true;
		try{
			HomeworkDAO.addRead(homework_uuid,content,req);
		}catch(Exception e){
			e.printStackTrace();
			isSuccess=false;
		}
		return isSuccess;
	}
//	@Transactional
//	public boolean addCloze(String homework_uuid,String content,HttpServletRequest req) {
//		// TODO Auto-generated method stub
//		boolean isSuccess=true;
//		try{
//			HomeworkDAO.addCloze(homework_uuid,content,req);
//		}catch(Exception e){
//			e.printStackTrace();
//			isSuccess=false;
//		}
//		return isSuccess;
//	}
	@Transactional
	public boolean addEssay(String homework_uuid,String content) {
		// TODO Auto-generated method stub
		boolean isSuccess=true;
		try{
			HomeworkDAO.addEssay(homework_uuid,content);
		}catch(Exception e){
			e.printStackTrace();
			isSuccess=false;
		}
		return isSuccess;
	}
	@Transactional
	public List<Homework> listHomeworks(int group_id) {
		// TODO Auto-generated method stub
		return HomeworkDAO.listHomeworks(group_id);
	}
	@Transactional
	public List<EssayAnswer> listEssayAnswers(String homework_uuid) {
		// TODO Auto-generated method stub
		return HomeworkDAO.listEssayAnswers(homework_uuid);
	}
	@Transactional
	public List<Grade> listGrades(String homework_uuid) {
		// TODO Auto-generated method stub
		return HomeworkDAO.listGrades(homework_uuid);
	}
	@Transactional
	public void dafen(String homeworkuuid, int studentid, float fenshu) {
		// TODO Auto-generated method stub
		HomeworkDAO.dafen(homeworkuuid,studentid,fenshu);
	}
}
