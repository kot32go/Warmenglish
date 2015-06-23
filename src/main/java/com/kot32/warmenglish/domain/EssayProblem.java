package com.kot32.warmenglish.domain;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_essay")
public class EssayProblem {
	@Id
	@GeneratedValue
	private int id;
	//题干
	private String des;
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
	public Homework getHomework() {
		return homework;
	}
	public void setHomework(Homework homework) {
		this.homework = homework;
	}
	
	
	public EssayProblem(String des, Homework homework) {
		super();
		this.des = des;
		this.homework = homework;
	}
	public EssayProblem() {
		// TODO Auto-generated constructor stub
	}
	
	
}
