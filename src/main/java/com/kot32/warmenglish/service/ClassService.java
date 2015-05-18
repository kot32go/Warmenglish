package com.kot32.warmenglish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.ClassDAO;

@Service
public class ClassService {
	@Autowired
	ClassDAO classDAO;
	@Transactional
	public boolean addClass(Class c){
		return classDAO.addClass(c);
	}
}
