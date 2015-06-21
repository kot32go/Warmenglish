package com.kot32.warmenglish.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_reading")
public class ReadingProblem {
	@Id
	@GeneratedValue
	private int id;
	//题干
	private String desPath;
	//5个选择题
	@OneToMany
	private List<SelectProblem> selectProblems;
	@ManyToOne
	private Homework homework;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDesPath() {
		return desPath;
	}
	public void setDesPath(String desPath) {
		this.desPath = desPath;
	}
	public List<SelectProblem> getSelectProblems() {
		return selectProblems;
	}
	public void setSelectProblems(List<SelectProblem> selectProblems) {
		this.selectProblems = selectProblems;
	}
	public Homework getHomework() {
		return homework;
	}
	public void setHomework(Homework homework) {
		this.homework = homework;
	}

	
	
	
}
