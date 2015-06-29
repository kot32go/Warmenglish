package com.kot32.warmenglish.domain.appPojo;

public class SelectProblem {
	public int id;
	// 题干
	public String des;
	// 4个答案
	public String a;
	public String b;
	public String c;
	public String d;
	// 正确答案
	public String answer;
	public String studentAnswer = "-1";
	public int homework_id;

	public SelectProblem(String des, String a, String b, String c, String d,
			String answer, Homework homework) {
		super();
		this.des = des;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.answer = answer;
	}

	public SelectProblem() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "SelectProblem [id=" + id + ", des=" + des + ", a=" + a + ", b="
				+ b + ", c=" + c + ", d=" + d + ", answer=" + answer
				+ ", studentAnswer=" + studentAnswer + ", homework_id="
				+ homework_id + "]";
	}

	public static SelectProblem copyFromSelectProblem(
			com.kot32.warmenglish.domain.SelectProblem p) {
		SelectProblem selectProblem = new SelectProblem();
		selectProblem.id = p.getId();
		selectProblem.des = p.getDes();
		selectProblem.a = p.getA();
		selectProblem.b = p.getB();
		selectProblem.c = p.getC();
		selectProblem.d = p.getD();
		selectProblem.answer = p.getAnswer();
		selectProblem.homework_id = p.getHomework().getId();
		return selectProblem;
	}

}
