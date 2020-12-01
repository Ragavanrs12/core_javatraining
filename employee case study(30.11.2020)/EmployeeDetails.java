package com.thirdware.file;

public class EmployeeDetails {
String employeeid,name,department,manager;
int grosssalary,experience;
public String getEmployeeid() {
	return employeeid;
}
public EmployeeDetails(String employeeid, String name, String department, String manager, int grosssalary,
		int experience) {
	super();
	this.employeeid = employeeid;
	this.name = name;
	this.department = department;
	this.manager = manager;
	this.grosssalary = grosssalary;
	this.experience = experience;
}
public void setEmployeeid(String employeeid) {
	this.employeeid = employeeid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}
public int getGrosssalary() {
	return grosssalary;
}
public void setGrosssalary(int grosssalary) {
	this.grosssalary = grosssalary;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
@Override
public String toString() {
	return "[employeeid=" + employeeid + ", name=" + name + ", department=" + department + ", manager="
			+ manager + ", grosssalary=" + grosssalary + ", experience=" + experience + "]\n";
}

}
