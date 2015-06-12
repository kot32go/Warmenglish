package com.kot32.warmenglish.domain.appPojo;

public class Group {
	private int id;
	private String name;
	private String tips;
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
	
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", tips=" + tips + "]";
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public static Group copyFromGroup(com.kot32.warmenglish.domain.Group g){
		Group group=new Group();
		group.id=g.getId();
		group.name=g.getName();
		group.tips=g.getTips();
		return group;
	}
	
	
}
