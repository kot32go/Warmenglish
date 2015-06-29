package com.kot32.warmenglish.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 记录所有选择类题型的学生答案（包括完型，阅读）
 * 
 * @author kot32
 *
 */
@Entity
@Table(name = "t_select_answer")
public class SelectAnswer {
	@Id
	@GeneratedValue
	private int id;
	// 选择题
	@ManyToOne
	private SelectProblem selectProblem;
	@ManyToOne
	private Student student;
	private String studentAnswer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SelectProblem getSelectProblem() {
		return selectProblem;
	}

	public void setSelectProblem(SelectProblem selectProblem) {
		this.selectProblem = selectProblem;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getStudentAnswer() {
		return studentAnswer;
	}

	public void setStudentAnswer(String studentAnswer) {
		this.studentAnswer = studentAnswer;
	}

}
