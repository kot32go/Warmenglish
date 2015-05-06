package com.kot32.warmenglish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.UserDAO;
import com.kot32.warmenglish.exception.UserException;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	@Transactional
	public boolean login(String username,String password) throws UserException{
		return userDAO.login(username, password);
	}
}
