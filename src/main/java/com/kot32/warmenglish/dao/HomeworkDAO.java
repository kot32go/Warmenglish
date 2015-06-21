package com.kot32.warmenglish.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Homework;
import com.kot32.warmenglish.domain.SelectProblem;
import com.kot32.warmenglish.util.Global;
import com.kot32.warmenglish.util.HibernateUtil;

@Repository
public class HomeworkDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public String addHomework(String des, String group_id) {
		String uuid = UUID.randomUUID().toString().substring(0, 5);
		Session session = sessionFactory.getCurrentSession();
		try {
			Group group = HibernateUtil.getCurrentGroup(session,
					Integer.parseInt(group_id));
			Homework homework = new Homework(des, group, new Date(), uuid);
			session.save(homework);
			group.getHomeworks().add(homework);
			session.update(group);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return uuid;
	}

	public String listClasses() {
		Session session = sessionFactory.getCurrentSession();
		Set<Class> classes = HibernateUtil.getCurrentTeacher(session,
				Global.logined_user.getId()).getClasses();
		String c = "";
		int size = classes.size();
		int tmp = 0;
		for (Class clazz : classes) {
			c += clazz.getId() + ":" + clazz.getName();
			if (tmp != size - 1) {
				c += ",";
			}
			tmp++;
		}
		return c;
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

	public void addSelectProbelm(String homework_uuid, String tigan, String a,
			String b, String c, String d, String rightAnswer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Homework h where h.uuid=:uuid");
		query.setParameter("uuid", homework_uuid);
		Homework homework = (Homework)query.list().get(0);
		SelectProblem selectProblem = new SelectProblem(tigan, a,b,c,d,rightAnswer, homework);
		session.save(selectProblem);
		homework.getSelectProblems().add(selectProblem);
		session.update(homework);
	}

}
