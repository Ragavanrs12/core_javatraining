package com.thirdware.file;

import java.util.Comparator;

public class sorting {
	
	
}
class EmloyeeId implements Comparator<EmployeeDetails>{
		@Override
		public int compare(EmployeeDetails o1, EmployeeDetails o2) {
			// TODO Auto-generated method stub
			return o1.getEmployeeid().compareTo(o2.getEmployeeid());
		}
	}
class EmloyeeName implements Comparator<EmployeeDetails>{
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
class EmloyeeManager implements Comparator<EmployeeDetails>{
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.getManager().compareTo(o2.getManager());
	}
}
class EmloyeeDepartment implements Comparator<EmployeeDetails>{
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
}
class EmloyeeExperience implements Comparator<EmployeeDetails>{
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
	if( o1.getExperience() == o2.getExperience())
		return 0;
	else if(o1.getExperience() > o2.getExperience())
		return 1;
	else
		return -1;
	}
}
class EmloyeeSalary implements Comparator<EmployeeDetails>{
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		if(o1.getGrosssalary()==o2.getGrosssalary())
			return 0;
		else if(o1.getGrosssalary() > o2.getGrosssalary())
			return 1;
		else
			return -1;
	}
}





