package com.tw.assignment;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Getter
//@Setter
public class Student {
private int studentid;
private String 	StudentName;
private Department dept;

public Student(int studentid, String studentName, Department dept) {
	super();
	this.studentid = studentid;
	StudentName = studentName;
	this.dept = dept;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getStudentid() {
	return studentid;
}

public void setStudentid(int studentid) {
	this.studentid = studentid;
}

public String getStudentName() {
	return StudentName;
}

public void setStudentName(String studentName) {
	StudentName = studentName;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Student [studentid=" + studentid + ", StudentName=" + StudentName + ", dept=" + dept + "]";
}

public void display() {
	System.out.println("this is student class");
	dept.display();
}
}
