package com.kot32.warmenglish.util;

import org.hibernate.Query;
import org.hibernate.Session;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;

public class HibernateUtil {
	public static User getCurrentTeacher(Session session,int t_id){
		return (User)session.createQuery("from User u where u.id="+t_id).list().get(0);
	}
	public static Class getCurrentClass(Session session,String uuid){
		Query query=session.createQuery("from Class c where c.uuid=:uuid");
		query.setParameter("uuid", uuid);
		return (Class)query.list().get(0);
	}
	public static Class getCurrentClass(Session session,int c_id){
		Query query=session.createQuery("from Class c where c.id=:id");
		query.setParameter("id", c_id);
		return (Class)query.list().get(0);
	}
	public static Student getCurrentStudent(Session session,int s_id){
		return (Student)session.createQuery("from Student s where s.id="+s_id).list().get(0);
	}
	
	public static Group getCurrentGroup(Session session,int g_id){
		return (Group)session.createQuery("from Group g where g.id="+g_id).list().get(0);
	}
	public static Group getClassDefultGroup(Session session,Class clazz){
		Query query=session.createQuery("from Group g where g.clazz=:clazz and g.name=:name");
		query.setParameter("clazz", clazz);
		query.setParameter("name", "默认小组");
		return (Group)query.list().get(0);
	}
}
