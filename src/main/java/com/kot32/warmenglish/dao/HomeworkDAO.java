package com.kot32.warmenglish.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Homework;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.util.Global;
import com.kot32.warmenglish.util.HibernateUtil;

@Repository
public class HomeworkDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addHomework(String des, String group_id) {
		boolean isSucces = true;
		Session session = sessionFactory.getCurrentSession();
		try {
			Group group = HibernateUtil.getCurrentGroup(session,
					Integer.parseInt(group_id));
			Homework homework = new Homework(des, group, new Date());
			session.save(homework);
			group.getHomeworks().add(homework);
			session.update(group);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			isSucces = false;
		}
		return isSucces;
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

	public ArrayList<com.kot32.warmenglish.domain.appPojo.Group> listGroups(int class_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Set<Group> groups = HibernateUtil.getCurrentClass(session,class_id).getGroups();
		ArrayList<com.kot32.warmenglish.domain.appPojo.Group> groups2 = new ArrayList<com.kot32.warmenglish.domain.appPojo.Group>();
		for (Group group : groups) {
			groups2.add(com.kot32.warmenglish.domain.appPojo.Group.copyFromGroup(group));
		}
		return groups2;
	}

}
