package com.thirdware.interface_inheritance;

public class Employee {
String empname;
int empno;
int empsalary;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public int getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}
@Override
public String toString() {
	return "Employee [empname=" + empname + ", empno=" + empno + ", empsalary=" + empsalary + "]";
}
public Employee(String empname, int empno, int empsalary) {
	super();
	this.empname = empname;
	this.empno = empno;
	this.empsalary = empsalary;
}

}
