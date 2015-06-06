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
	public User login(String username,String password) throws UserException{
		return appdao.login(username, password);
	}
	
	@Transactional
	public boolean register(Student student) throws UserException{
		return appdao.register(student);
	}
}
