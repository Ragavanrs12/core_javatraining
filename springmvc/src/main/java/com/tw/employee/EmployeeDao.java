package com.tw.employee;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public interface EmployeeDao {
	public List<Employee> getEmployeeList();

	public void setDataSource(DataSource dba);
	
	public Employee findEmployeeByID(int id);
	
	public Employee updateEmployee(int id,Employee employee);
	
	public Employee addEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
}
