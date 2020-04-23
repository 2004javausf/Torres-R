package com.revature.compare;

public class Student implements Comparable<Student>{
	//1st method of comparing - Implement Comparable
	private int studentID;
	private String label;
	private double gpa;

	public Student() {
		super();
		
	}
	public Student(int studentID, String label, double gpa) {
		super();
		this.studentID = studentID;
		this.label = label;
		this.gpa = gpa;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@Override
	public String toString() {
		return "Student [studentID = " + studentID + ", label = " + label + "gpa = " + gpa + "]";
	}
	@Override
	public int compareTo(Student arg0) {
		return arg0.getStudentID()-arg0.getStudentID();
	}


}
