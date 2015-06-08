package com.kot32.warmenglish.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_grade")
public class Grade {
	@Id
	@GeneratedValue
	private int id;
	private float selectGrade;
	
	@ManyToOne
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSelectGrade() {
		return selectGrade;
	}

	public void setSelectGrade(float selectGrade) {
		this.selectGrade = selectGrade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", selectGrade=" + selectGrade
				+ ", student=" + student + "]";
	}
	
	
}
