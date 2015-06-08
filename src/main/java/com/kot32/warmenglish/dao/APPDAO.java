package com.kot32.warmenglish.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;

@Repository
public class APPDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Student login(String username, String password) {
		Query query = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from Student u where u.username=:username and u.password=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		Student student=null;
		int size = query.list().size();
		if (size > 0) {
			student= (Student)query.list().get(0);
		}
		return student;
	}

	public boolean register(Student student) {
		Session session = sessionFactory.getCurrentSession();
		try{
			session.save(student);
		}catch(Exception e){
			return false;
		}
		return true;
	}
}
