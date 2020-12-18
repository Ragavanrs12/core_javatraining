package com.tw.jdbcconfig;

public class Student {
	private int studentID;
	private String studentName;
	private int studentAge;

	public Student() {
	}

	public Student(int studentID, String studentName, int studentAge) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student: \n\tStudentID: " + studentID + "\n\tStudentName:" + studentName + "\n\tStudentAge: " + studentAge;
	}

}
