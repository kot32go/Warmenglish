package com.kot32.warmenglish.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import antlr.collections.List;

@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	private String password;
	@OneToMany( fetch=FetchType.EAGER, mappedBy = "user")
	private Set<Class> classes;
	
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
	@Size(min=1,max=15,message="密码的长度应该在1-15之间")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotEmpty(message="用户名不能为空!")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Set<Class> getClasses() {
		return classes;
	}
	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username
				+ ", password=" + password + ", classes=" + classes + "]";
	}
	
	
	
	
}
