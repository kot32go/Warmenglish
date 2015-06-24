package com.kot32.warmenglish.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import com.kot32.warmenglish.domain.appPojo.Homework;
import com.kot32.warmenglish.domain.appPojo.SelectProblem;

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
			Group group = HibernateUtil.getClassDefultGroup(session, clazz);
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

	public ArrayList<com.kot32.warmenglish.domain.appPojo.Group> listGroups(
			int class_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Set<Group> groups = HibernateUtil.getCurrentClass(session, class_id)
				.getGroups();
		ArrayList<com.kot32.warmenglish.domain.appPojo.Group> groups2 = new ArrayList<com.kot32.warmenglish.domain.appPojo.Group>();
		for (Group group : groups) {
			groups2.add(com.kot32.warmenglish.domain.appPojo.Group
					.copyFromGroup(group));
		}
		return groups2;
	}

	public ArrayList<Homework> listHomeworks(String student_id) {
		Session session = sessionFactory.getCurrentSession();
		// 先找出学生所在的小组
		Student student = HibernateUtil.getCurrentStudent(session,
				Integer.parseInt(student_id));
		Group group = student.getGroup();
		// 找出小组的作业
		Query query = session.createQuery("from Homework h where h.group=:group");
		query.setParameter("group", group);
		List<com.kot32.warmenglish.domain.Homework> h = (ArrayList<com.kot32.warmenglish.domain.Homework>) query
				.list();
		List<Homework> homeworks = new ArrayList<Homework>();
		
		for (com.kot32.warmenglish.domain.Homework homework : h) {
			homeworks.add(Homework.copyFromHomework(homework));
		}
		return (ArrayList<Homework>) homeworks;
	}

	public List<SelectProblem> listSelects(String uuid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<SelectProblem> selectProblems=new ArrayList<SelectProblem>();
		com.kot32.warmenglish.domain.Homework homework=HibernateUtil.getCurrentHomework(session, uuid);
		List<com.kot32.warmenglish.domain.SelectProblem> tmp=new ArrayList<com.kot32.warmenglish.domain.SelectProblem>();
		for(com.kot32.warmenglish.domain.SelectProblem selectProblem:homework.getSelectProblems()){
			tmp.add(selectProblem);
		}
		//现在得到了服务器端的Problems，要转化为客户端适用的版本
		for(com.kot32.warmenglish.domain.SelectProblem p :tmp){
			selectProblems.add(SelectProblem.copyFromSelectProblem(p));
		}
		return selectProblems;
	}
	
	
	
}
