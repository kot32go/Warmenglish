package com.kot32.warmenglish.dao;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.Message;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.util.Const;
import com.tencent.xinge.XingeApp;

@Repository
public class MessageDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean sendMessage(User teacher,String class_uuid, String title, String content) {
		// 先将推送内容存进数据库
		// 根据class_uuid 查找班级
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Class c where c.uuid=:uuid");
		query.setParameter("uuid", class_uuid);
		Class clazz = (Class)query.list().get(0);
		
		Message message=new Message( title, content, new Date(), teacher, clazz);
		session.save(message);
		// 推送的学生tag就是class的 uuid
		XingeApp.pushTagAndroid(Const.XG_ACCESS_ID, Const.XG_SECRET_KEY, title,
				content, class_uuid);
		return true;
	}
}
