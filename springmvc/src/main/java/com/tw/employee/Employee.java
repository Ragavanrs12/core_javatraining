package com.tw.employee;

public class Employee {
private int id;
private String employeename;
private String department;
private int salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String employeename, String department, int salary) {
	super();
	this.id = id;
	this.employeename = employeename;
	this.department = department;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", employeename=" + employeename + ", department=" + department + ", salary=" + salary
			+ "]";
}

}
