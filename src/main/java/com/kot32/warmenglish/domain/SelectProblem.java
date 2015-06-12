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
	private String answers[]=new String[4];
	//正确答案
	private String answer;
	//学生的答案
	private String student_answer;
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
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
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
	
	public String getStudent_answer() {
		return student_answer;
	}
	public void setStudent_answer(String student_answer) {
		this.student_answer = student_answer;
	}
	@Override
	public String toString() {
		return "SelectProblem [id=" + id + ", des=" + des + ", answers="
				+ Arrays.toString(answers) + ", answer=" + answer
				+ ", student_answer=" + student_answer + ", homework="
				+ homework + "]";
	}
	
	
}
