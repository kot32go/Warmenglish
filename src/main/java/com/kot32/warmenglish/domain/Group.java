package com.kot32.warmenglish.domain;

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

@Entity
@Table(name = "t_group")
public class Group {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	private String tips;
	@ManyToOne
	private Class clazz;
	
	// 一个组很多学生
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "group",cascade={CascadeType.ALL})
	private Set<Student> students = new HashSet<Student>();
	
	// 一个组很多作业
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "group",cascade={CascadeType.ALL})
	private Set<Homework> homeworks = new HashSet<Homework>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Homework> getHomeworks() {
		return homeworks;
	}

	public void setHomeworks(Set<Homework> homeworks) {
		this.homeworks = homeworks;
	}


	
	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	@Override
	public boolean equals(Object obj) {
		// 判断两个小组是不是同一个组，首先看是不是同一个班级
		if ((clazz.getId() == ((Group) obj).getClazz().getId())
				&& (getId() == ((Group) obj).getId())) {
			return true;
		} else {
			return false;
		}
	}

	public Group(String name,String tips, Class clazz) {
		super();
		this.name = name;
		this.tips=tips;
		this.clazz = clazz;
	
	}
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	

}
