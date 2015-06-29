<<<<<<< HEAD
package com.kot32.warmenglish.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Message;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.util.HibernateUtil;

@Repository
public class ClassDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addClass(User teacher, com.kot32.warmenglish.domain.Class c) {
		Session session = sessionFactory.getCurrentSession();
		// 先创建一个默认小组并保存
		Group group = new Group("默认小组", "创建班级时默认添加的小组", c);
		c.getGroups().add(group);
		session.save(group);
		session.save(c);
		teacher = HibernateUtil.getCurrentTeacher(session, teacher.getId());
		teacher.getClasses().add(c);

		try {
			session.update(teacher);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List listClass(User teacher) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.user=:user");
		query.setParameter("user", teacher);
		return query.list();
	}

	public void deleteClass(String uuid) {
		// 先找出班级，再从教师的班级列表中删掉，更新教师表，再从数据库删掉这个班级
		Session session = sessionFactory.getCurrentSession();
		Class clazz = (Class) session
				.createQuery("from Class c where uuid='" + uuid + "'").list()
				.get(0);
		clazz.getUser().getClasses().remove(clazz);
		session.update(clazz.getUser());

		// 删掉改班级下的所有小组，推送消息
		Query query = session
				.createQuery("delete from Group g where g.clazz=:clazz");
		query.setParameter("clazz", clazz);
		query.executeUpdate();

		query = session
				.createQuery("delete from Message m where m.clazz=:clazz");
		query.setParameter("clazz", clazz);
		query.executeUpdate();

		// 删掉该班级
		query = session.createQuery("delete from Class c where c.uuid=:id");
		query.setParameter("id", uuid);
		query.executeUpdate();

	}

	public void addGroup(String class_uuid, String name, String tips) {
		Session session = sessionFactory.getCurrentSession();
		Class clazz = (Class) session
				.createQuery("from Class c where uuid='" + class_uuid + "'")
				.list().get(0);
		// 首先在班级中添加对它的引用，在保存它，再更新班级
		Group group = new Group(name, tips, clazz);
		session.save(group);
		clazz.getGroups().add(group);
		session.update(clazz);
	}

	public List<Group> listGroup(String uuid) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.uuid=:uuid");
		query.setParameter("uuid", uuid);
		Class clazz = (Class) query.list().get(0);
		query = session.createQuery("from Group g where g.clazz=:clazz");
		query.setParameter("clazz", clazz);
		return query.list();
	}

	public List<Group> listAllGroup(User teacher) {
		// 先根据user找到class
		// 再根据class_id找到小组
		List<Group> groups = new ArrayList<Group>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.user=:user");
		query.setParameter("user", teacher);
		
		List<Class> clazzs = query.list();
		for (Class clazz : clazzs) {
			query = session.createQuery("from Group g where g.clazz=:clazz");
			query.setParameter("clazz", clazz);
			groups.addAll(query.list());
		}
		return groups;
	}
	
	public List<Student> list_members(int group){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Student s where s.group=:group");
		Query q=session.createQuery("from Group p where p.id=:id");
		q.setParameter("id", group);
		Group g=(Group) q.list().get(0);
		query.setParameter("group", g);
		return query.list();
	}
	//根据name找到class
		//再根据class找到默认小组
		public List<Student> list_unmembers(int clazz_id){
			Session session = sessionFactory.getCurrentSession();
			Query query1 = session.createQuery("from Class c where c.id=:id");
			query1.setParameter("id", clazz_id);
			Class l=(Class) query1.list().get(0);
			Query query2=session.createQuery("from Group g where g.clazz=:clazz and g.name=:name");
			query2.setParameter("clazz", l);
			query2.setParameter("name", "默认小组");
			Group p=(Group)query2.list().get(0);
			Query query=session.createQuery("from Student s where s.group=:group");
			query.setParameter("group", p);
			return query.list();
		}
		
		//根据班级id找到班级
		//再根据班级找到默认小组id
		//把学生的小组改为默认小组
		public void delete_members(int[] student_id,int clazz_id){
			Session session = sessionFactory.getCurrentSession();
			Query query1 = session.createQuery("from Class c where c.id=:id");
			query1.setParameter("id", clazz_id);
			Class l=(Class) query1.list().get(0);
			Query query2=session.createQuery("from Group g where g.clazz=:clazz and g.name=:name");
			query2.setParameter("clazz", l);
			query2.setParameter("name", "默认小组");
			Group p=(Group)query2.list().get(0);
			for(int i=0;i<student_id.length;i++){
				Query query=session.createQuery("update Student s set s.group=:group where s.id=:id");
				query.setParameter("group", p);
				query.setParameter("id", student_id[i]);
				query.executeUpdate();
			}	
		}

		//根据studen_id把这些学生的小组改为group_id
		public void add_members(int[] student_id,int group_id){
			Session session = sessionFactory.getCurrentSession();
			Query query1=session.createQuery("from Group g where g.id=:id");
			query1.setParameter("id", group_id);
			Group g=(Group) query1.list().get(0);
			for(int i=0;i<student_id.length;i++){
				Query query=session.createQuery("update Student s set s.group=:group where s.id=:id");
				query.setParameter("group", g);
				query.setParameter("id", student_id[i]);
				query.executeUpdate();
			}	
		}

}
=======
package com.kot32.warmenglish.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Message;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.util.HibernateUtil;

@Repository
public class ClassDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addClass(User teacher, com.kot32.warmenglish.domain.Class c) {
		Session session = sessionFactory.getCurrentSession();
		// 先创建一个默认小组并保存
		Group group = new Group("默认小组", "创建班级时默认添加的小组", c);
		c.getGroups().add(group);
		session.save(group);
		session.save(c);
		teacher = HibernateUtil.getCurrentTeacher(session, teacher.getId());
		teacher.getClasses().add(c);

		try {
			session.update(teacher);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List listClass(User teacher) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.user=:user");
		query.setParameter("user", teacher);
		return query.list();
	}

	public void deleteClass(String uuid) {
		// 先找出班级，再从教师的班级列表中删掉，更新教师表，再从数据库删掉这个班级
		Session session = sessionFactory.getCurrentSession();
		Class clazz = (Class) session
				.createQuery("from Class c where uuid='" + uuid + "'").list()
				.get(0);
		clazz.getUser().getClasses().remove(clazz);
		session.update(clazz.getUser());

		// 删掉改班级下的所有小组，推送消息
		Query query = session
				.createQuery("delete from Group g where g.clazz=:clazz");
		query.setParameter("clazz", clazz);
		query.executeUpdate();

		query = session
				.createQuery("delete from Message m where m.clazz=:clazz");
		query.setParameter("clazz", clazz);
		query.executeUpdate();

		// 删掉该班级
		query = session.createQuery("delete from Class c where c.uuid=:id");
		query.setParameter("id", uuid);
		query.executeUpdate();

	}

	public void addGroup(String class_uuid, String name, String tips) {
		Session session = sessionFactory.getCurrentSession();
		Class clazz = (Class) session
				.createQuery("from Class c where uuid='" + class_uuid + "'")
				.list().get(0);
		// 首先在班级中添加对它的引用，在保存它，再更新班级
		Group group = new Group(name, tips, clazz);
		session.save(group);
		clazz.getGroups().add(group);
		session.update(clazz);
	}

	public List<Group> listGroup(String uuid) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.uuid=:uuid");
		query.setParameter("uuid", uuid);
		Class clazz = (Class) query.list().get(0);
		query = session.createQuery("from Group g where g.clazz=:clazz");
		query.setParameter("clazz", clazz);
		return query.list();
	}

	public List<Group> listAllGroup(User teacher) {
		// 先根据user找到class
		// 再根据class_id找到小组
		List<Group> groups = new ArrayList<Group>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.user=:user");
		query.setParameter("user", teacher);
		
		List<Class> clazzs = query.list();
		for (Class clazz : clazzs) {
			query = session.createQuery("from Group g where g.clazz=:clazz");
			query.setParameter("clazz", clazz);
			groups.addAll(query.list());
		}
		return groups;
	}
	
	public List<Student> list_members(int group_id){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Student s where s.group=:group");
		Query q=session.createQuery("from Group p where p.id=:id");
		q.setParameter("id", group_id);
		Group g=(Group) q.list().get(0);
		query.setParameter("group", g);
		return query.list();
	}

}
>>>>>>> origin/master
