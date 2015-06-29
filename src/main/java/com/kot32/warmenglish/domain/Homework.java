package com.kot32.warmenglish.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "t_homework")
public class Homework {
	@Id
	@GeneratedValue
	private int id;

	// 本次作业的要求描述
	private String des;
	@JsonIgnore
	// 布置的小组
	@ManyToOne
	private Group group;
	// 布置的时间
	private Date date;

	// 选择题
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "homework", cascade = { CascadeType.ALL })
	private Set<SelectProblem> selectProblems = new HashSet<SelectProblem>();

	// 阅读题
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "homework", cascade = { CascadeType.ALL })
	private Set<ReadingProblem> readingProblems = new HashSet<ReadingProblem>();

	// 作文
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "homework", cascade = { CascadeType.ALL })
	private Set<EssayProblem> essayProblems = new HashSet<EssayProblem>();

	// 作文
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "homework", cascade = { CascadeType.ALL })
	private Set<Grade> grades = new HashSet<Grade>();
	// 学生的答案
	private String student_answer;

	private String uuid;

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

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<SelectProblem> getSelectProblems() {
		return selectProblems;
	}

	public void setSelectProblems(Set<SelectProblem> selectProblems) {
		this.selectProblems = selectProblems;
	}

	public String getStudent_answer() {
		return student_answer;
	}

	public void setStudent_answer(String student_answer) {
		this.student_answer = student_answer;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Homework() {
		// TODO Auto-generated constructor stub
	}

	public Set<ReadingProblem> getReadingProblems() {
		return readingProblems;
	}

	public void setReadingProblems(Set<ReadingProblem> readingProblems) {
		this.readingProblems = readingProblems;
	}

	public Homework(String des, Group group, Date date, String uuid) {
		super();
		this.des = des;
		this.group = group;
		this.date = date;
		this.uuid = uuid;
	}

	public Set<EssayProblem> getEssayProblems() {
		return essayProblems;
	}

	public void setEssayProblems(Set<EssayProblem> essayProblems) {
		this.essayProblems = essayProblems;
	}

}
