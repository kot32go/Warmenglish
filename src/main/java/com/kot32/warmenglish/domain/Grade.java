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
	private float readingGrade;
	private float clozeGrade;
	private float essayGrade;
	@ManyToOne
	private Student student;
	@ManyToOne
	private Homework homework;
	
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

	public float getReadingGrade() {
		return readingGrade;
	}

	public void setReadingGrade(float readingGrade) {
		this.readingGrade = readingGrade;
	}

	public float getClozeGrade() {
		return clozeGrade;
	}

	public void setClozeGrade(float clozeGrade) {
		this.clozeGrade = clozeGrade;
	}

	public float getEssayGrade() {
		return essayGrade;
	}

	public void setEssayGrade(float essayGrade) {
		this.essayGrade = essayGrade;
	}

	public Homework getHomework() {
		return homework;
	}

	public void setHomework(Homework homework) {
		this.homework = homework;
	}
	

	
	
}
