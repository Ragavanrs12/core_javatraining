package com.tw.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Student {
private int Studentid;
private String StudentName;
private int Marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentid, String studentName, int marks) {
	super();
	Studentid = studentid;
	StudentName = studentName;
	Marks = marks;
}

public int getStudentid() {
	return Studentid;
}
public void setStudentid(int studentid) {
	Studentid = studentid;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getMarks() {
	return Marks;
}
public void setMarks(int marks) {
	Marks = marks;
}
@Override
public String toString() {
	return "Student [Studentid=" + Studentid + ", StudentName=" + StudentName + ", Marks=" + Marks + "]\n";
}

}
