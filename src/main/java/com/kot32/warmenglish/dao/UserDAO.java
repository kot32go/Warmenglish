package com.kot32.warmenglish.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean login(String username,String password){
		Query query=sessionFactory.getCurrentSession()
				.createQuery("from User u where u.username=:username and u.password=:password")	;
		query.setParameter("username", username);
		query.setParameter("password", password);
		System.out.println(query.getQueryString());
		int size=query.list().size();
		if(size>0){
			return true;
		}
		return false;
	}
	
}
