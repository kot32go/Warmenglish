package com.kot32.warmenglish.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.User;

@Repository
public class ClassDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addClass(User teacher,com.kot32.warmenglish.domain.Class c) {
		// TODO Auto-generated method stub
		teacher.getClasses().add(c);
		Session session = sessionFactory.getCurrentSession();
		session.save(c);
		try{
			session.update(teacher);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	public Set<Class> listClass(User teacher) {
		// TODO Auto-generated method stub
		return teacher.getClasses();
	}
	
}
