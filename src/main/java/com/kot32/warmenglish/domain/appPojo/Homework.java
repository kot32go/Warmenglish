package com.kot32.warmenglish.domain.appPojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Homework{
	private int id;

	// 本次作业的要求描述
	public String des;

	// 布置的时间
	public Date date;
	// 选择题
	public List<SelectProblem> selectProblems = new ArrayList<SelectProblem>();
	// 阅读题
	public List<ReadingProblem> readingProblems = new ArrayList<ReadingProblem>();

	public String uuid;

	@Override
	public String toString() {
		return "Homework [id=" + id + ", des=" + des + ", date=" + date
				+ ", selectProblems=" + selectProblems + ", readingProblems="
				+ readingProblems
				+ ", uuid=" + uuid + "]";
	}

	public Homework(String des, Group group, Date date, String uuid) {
		super();
		this.des = des;
		this.date = date;
		this.uuid = uuid;
	}

	public Homework() {
		// TODO Auto-generated constructor stub
	}
	public static Homework copyFromHomework(com.kot32.warmenglish.domain.Homework h) {
		Homework homework=new Homework();
		homework.id = h.getId();
		homework.des = h.getDes();
		homework.date = h.getDate();
		
		homework.uuid = h.getUuid();
		return homework;
	}

}
