package com.kot32.warmenglish.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.ClassDAO;
import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.User;

@Service
public class ClassService {
	@Autowired
	ClassDAO classDAO;
	@Transactional
	public boolean addClass(User teacher,com.kot32.warmenglish.domain.Class c){
		return classDAO.addClass(teacher,c);
	}
	
	@Transactional
	public Set<Class>  listClass(User teacher){
		return classDAO.listClass(teacher);
	}
}
