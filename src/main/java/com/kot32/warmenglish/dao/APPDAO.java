package com.kot32.warmenglish.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.util.HibernateUtil;
import com.kot32.warmenglish.domain.Class;

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
		Student student = null;
		int size = query.list().size();
		if (size > 0) {
			student = (Student) query.list().get(0);
		}
		return student;
	}

	public boolean register(Student student) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.save(student);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public String query_class(String class_uuid) {
		// TODO Auto-generated method stub
		String class_name;
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Class c where c.uuid=:uuid");
		query.setParameter("uuid", class_uuid);
		class_name = ((com.kot32.warmenglish.domain.Class) query.list().get(0))
				.getName();
		return class_name;
	}

	public boolean updateInfo(String student_id, String class_uuid, String email) {
		boolean isSuccess = true;
		try {
			Session session = sessionFactory.getCurrentSession();
			// 先找出学生，再找出班级，再找出小组，再把小组更新一下,再更新学生
			Student student = HibernateUtil.getCurrentStudent(session,
					Integer.parseInt(student_id));
			Class clazz = HibernateUtil.getCurrentClass(session, class_uuid);
			Group group=HibernateUtil.getClassDefultGroup(session, clazz);
			student.setAdult_email(email);
			student.setClazz(clazz);
			student.setGroup(group);
			session.update(student);
			group.getStudents().add(student);
			session.update(group);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			isSuccess = false;
		}

		return isSuccess;
	}
}
