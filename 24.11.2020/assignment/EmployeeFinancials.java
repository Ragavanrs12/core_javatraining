package com.thirdware.assignment;

public class EmployeeFinancials  {
int basesalary;
int income;

Employee emp;
public int Updatedannualsalary(Employee emp) {
return this.basesalary= (int) ((emp.getSalary()*12)*1.05);

}
public int taxincome(Employee emp) {
if(emp.getGender()=='M') {
	return this.income=(int) (((emp.getSalary()*12)*1.05)-(((emp.getSalary()*12)*1.05)*0.9));
}else
	return this.income=(int) (((emp.getSalary()*12)*1.05)-(((emp.getSalary()*12)*1.05)*0.95));
}


	
}
