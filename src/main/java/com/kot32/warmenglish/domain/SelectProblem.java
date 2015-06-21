package com.kot32.warmenglish.domain;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_select")
public class SelectProblem {
	@Id
	@GeneratedValue
	private int id;
	//题干
	private String des;
	//4个答案
	private String a;
	private String b;
	private String c;
	private String d;
	//正确答案
	private String answer;
	//属于哪一次作业的
	@ManyToOne
	private Homework homework;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Homework getHomework() {
		return homework;
	}
	public void setHomework(Homework homework) {
		this.homework = homework;
	}
	
	
	public SelectProblem(String des, String a, String b, String c, String d,
			String answer, Homework homework) {
		super();
		this.des = des;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.answer = answer;
		this.homework = homework;
	}
	public SelectProblem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SelectProblem [id=" + id + ", des=" + des + ", a=" + a + ", b="
				+ b + ", c=" + c + ", d=" + d + ", answer=" + answer
				+ ", homework=" + homework + "]";
	}
	
	
	
}
