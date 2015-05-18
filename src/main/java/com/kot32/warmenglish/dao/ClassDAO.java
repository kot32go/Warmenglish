package com.kot32.warmenglish.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addClass(Class c) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		try{
			session.save(c);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
}
