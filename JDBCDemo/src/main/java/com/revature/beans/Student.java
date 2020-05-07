package com.revature.beans;

public class Student {
	private int id;
	private String name;
	private int sch_id;
	
	public Student() {
		super();
		
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

	public int getSch_id() {
		return sch_id;
	}

	public void setSch_id(int sch_id) {
		this.sch_id = sch_id;
	}

	public Student(int id, String name, int sch_id) {
		super();
		this.id = id;
		this.name = name;
		this.sch_id = sch_id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sch_id=" + sch_id + "]";
	}
	
	
	
	

}
