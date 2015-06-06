package com.kot32.warmenglish.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "t_class", uniqueConstraints = @UniqueConstraint(columnNames = { "uuid" }))
public class Class {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Column(name = "uuid")
	private String uuid;
	@ManyToOne
	private User user;
	private String des;

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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", uuid=" + uuid
				+ ", user=" + user + ", des=" + des + "]";
	}

	
}
