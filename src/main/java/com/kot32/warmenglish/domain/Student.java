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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "t_student")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	private String password;
	private String adult_email;
	@JsonIgnore
	@ManyToOne
	private Class clazz;
	@JsonIgnore
	@ManyToOne
	private User user;
	@JsonIgnore
	@ManyToOne
	private Group group;
	// 学生有很多次成绩
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "student", cascade = { CascadeType.ALL })
	private Set<Grade> homeworks = new HashSet<Grade>();

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Set<Grade> getHomeworks() {
		return homeworks;
	}

	public void setHomeworks(Set<Grade> homeworks) {
		this.homeworks = homeworks;
	}

	public String getAdult_email() {
		return adult_email;
	}

	public void setAdult_email(String adult_email) {
		this.adult_email = adult_email;
	}

}
