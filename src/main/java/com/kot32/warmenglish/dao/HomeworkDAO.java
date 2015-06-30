package com.kot32.warmenglish.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.EssayAnswer;
import com.kot32.warmenglish.domain.EssayProblem;
import com.kot32.warmenglish.domain.Grade;
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Homework;
import com.kot32.warmenglish.domain.ReadingProblem;
import com.kot32.warmenglish.domain.SelectProblem;
import com.kot32.warmenglish.domain.Student;
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
		Homework homework = (Homework) query.list().get(0);
		SelectProblem selectProblem = new SelectProblem(tigan, a, b, c, d,
				rightAnswer, homework);
		session.save(selectProblem);
		homework.getSelectProblems().add(selectProblem);
		session.update(homework);
	}

	public void addRead(String homework_uuid, String content,
			HttpServletRequest req) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Homework homework = HibernateUtil.getCurrentHomework(session,
				homework_uuid);
		List<SelectProblem> selectProblems = new ArrayList<SelectProblem>();
		// 将文章保存在文件中，题目和答案抽取出来
		String tigan = content.split("[q]")[0];
		String timu = content.split("[q]")[1];
		String realPath = req.getSession().getServletContext()
				.getRealPath("/resources/upload");
		String path = UUID.randomUUID().toString().substring(0, 5);
		File file = new File(realPath + "/" + path + ".html");
		FileUtils.writeStringToFile(file, tigan, "utf8");
		ReadingProblem readingProblem = new ReadingProblem();
		readingProblem.setDesPath(path);
		// 开始解析题目
		Scanner scanner = new Scanner(timu);
		SelectProblem selectProblem = null;
		int index = 0;
		while (scanner.hasNextLine()) {
			// 如果第一个字母是数字，那么当做题目处理
			String tmp = scanner.nextLine().trim();
			if (tmp == null || tmp.length() == 0 || tmp.equals("")) {
				continue;
			}
			String s = tmp.substring(0, 1);
			if (s.equals("1") || s.equals("2") || s.equals("3")
					|| s.equals("4") || s.equals("5") || s.equals("6")) {
				selectProblem = new SelectProblem();
				selectProblem.setDes(tmp);
			}
			// 如果是字母，当做答案处理
			else if (s.equals("A") || s.equals("B") || s.equals("C")
					|| s.equals("D") || s.equals("a") || s.equals("b")
					|| s.equals("c") || s.equals("d")) {

				// 如果最后有*，代表是正确答案
				if (tmp.charAt(tmp.length() - 1) == '*') {
					tmp = tmp.substring(1, tmp.length() - 1);
					selectProblem.setAnswer(tmp);
				}

				if (s.equals("A") || s.equals("a")) {
					selectProblem.setA(tmp.substring(1, tmp.length()));
				}
				if (s.equals("B") || s.equals("b")) {
					selectProblem.setB(tmp.substring(1, tmp.length()));
				}
				if (s.equals("C") || s.equals("c")) {
					selectProblem.setC(tmp.substring(1, tmp.length()));
				}
				if (s.equals("D") || s.equals("d")) {
					selectProblem.setD(tmp.substring(1, tmp.length()));
					selectProblems.add(selectProblem);
				}
			}
		}
		for (SelectProblem selectProblem2 : selectProblems) {
			session.saveOrUpdate(selectProblem2);
		}
		// 现在就差保存在homework里面啦
		readingProblem.setSelectProblems(selectProblems);
		readingProblem.setHomework(homework);
		session.saveOrUpdate(readingProblem);
		homework.getReadingProblems().add(readingProblem);
		session.update(homework);

	}

	public void addEssay(String homework_uuid, String content) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Homework h where h.uuid=:uuid");
		query.setParameter("uuid", homework_uuid);
		Homework homework = (Homework) query.list().get(0);
		EssayProblem essayProblem = new EssayProblem(1,content, homework);
		session.flush();
		session.save(essayProblem);
		
		homework.getEssayProblems().add(essayProblem);
		session.update(homework);
	}

	public List<Homework> listHomeworks(int group_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query q1 = session.createQuery("from Group g where g.id=:id");
		q1.setParameter("id", group_id);
		Group group = (Group) q1.list().get(0);
		Query q2 = session.createQuery("from Homework h where h.group=:group");
		q2.setParameter("group", group);
		return q2.list();
	}

	public List<EssayAnswer> listEssayAnswers(String homework_uuid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Homework homework = HibernateUtil.getCurrentHomework(session,
				homework_uuid);
		Query query = session
				.createQuery("from EssayAnswer e where e.essayProblem.homework=:h");
		query.setParameter("h", homework);
		return query.list();
	}

	public List<Grade> listGrades(String homework_uuid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Grade g where g.homework.uuid=:uuid");
		query.setParameter("uuid", homework_uuid);
		return query.list();
	}

	public void dafen(String homeworkuuid, int studentid, float fenshu) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Homework homework=HibernateUtil.getCurrentHomework(session, homeworkuuid);
		Student student=HibernateUtil.getCurrentStudent(session, studentid);
		Query query=session.createQuery("from Grade g where g.homework=:homework and g.student=:student");
		query.setParameter("homework", homework);
		query.setParameter("student", student);
		if(query.list().size()==0){
			Grade grade=new Grade();
			grade.setHomework(homework);
			grade.setStudent(student);
			grade.setEssayGrade(fenshu);
			session.save(grade);
		}else{
			Grade grade=(Grade) query.list().get(0);
			grade.setEssayGrade(fenshu);
			session.update(grade);
		}
	}

}
