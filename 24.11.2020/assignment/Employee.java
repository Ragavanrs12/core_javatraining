package com.thirdware.assignment;

public class Employee extends PersonalInfo {
private String name;
private Department dept;
private double salary;
public Employee(int id, String phone, String address, char gender, String name,  double salary,int deptCode,String deptName) {
	super(id, phone, address, gender);
	this.name = name;
	this.dept = new Department(deptCode,deptName);
	this.salary = salary;
}
public String getName() {
	return name;
}
public Department getDept() {
	return dept;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", toString()=" + super.toString()
			+ "]";
}

}
