package com.spring.demo;

public class Student {
	private int id;
	private String name;
	private String branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void DisplayInfo() {
		System.out.println("hello:"+name);
        System.out.println("id:"+id);
        System.out.println("branch:"+branch);
	}
}
