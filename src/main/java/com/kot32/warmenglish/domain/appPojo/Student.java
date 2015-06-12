package com.kot32.warmenglish.domain.appPojo;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private String username;
	private String password;
	private String adult_email;

	private int class_id;
	private int group_id;
	private String tag;

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

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

	public String getAdult_email() {
		return adult_email;
	}

	public void setAdult_email(String adult_email) {
		this.adult_email = adult_email;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", username="
				+ username + ", password=" + password + ", adult_email="
				+ adult_email + ", class_id=" + class_id + ", group_id="
				+ group_id + ", tag=" + tag + "]";
	}

	public static Student copyFromStudent(com.kot32.warmenglish.domain.Student s) {
		Student student = new Student();
		;
		student.id = s.getId();
		student.username = s.getUsername();
		student.password = s.getPassword();
		if (s.getName() != null)
			student.name = s.getName();
		if (s.getAdult_email() != null)
			student.adult_email = s.getAdult_email();
		if (s.getClazz() != null) {
			student.tag = s.getClazz().getUuid();
			student.class_id = s.getClazz().getId();
		}
		if (s.getGroup() != null) {
			student.group_id = s.getGroup().getId();
		}
		return student;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
