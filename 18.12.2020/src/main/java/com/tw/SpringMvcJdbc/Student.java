package com.tw.SpringMvcJdbc;

public class Student {
private int studentid;
private String studentname;
private int marks;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Student(int studentid, String studentname, int marks) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.marks = marks;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", marks=" + marks + "]";
}

}
