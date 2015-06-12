package com.kot32.warmenglish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.APPDAO;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.UserException;
@Service
public class APPService {
	
	@Autowired
	APPDAO appdao;
	
	@Transactional
	public Student login(String username,String password) throws UserException{
		return appdao.login(username, password);
	}
	
	@Transactional
	public boolean register(Student student) throws UserException{
		return appdao.register(student);
	}
	@Transactional
	public String query_class(String class_uuid) {
		// TODO Auto-generated method stub
		return appdao.query_class(class_uuid) ;
	}
	@Transactional
	public boolean updateInfo(String student_id, String class_uuid, String email) {
		// TODO Auto-generated method stub
		return appdao.updateInfo(student_id,class_uuid,email);
	}
}
