package com.tw.employee;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query("select * from employee", new EmployeeMapperClass());
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Employee findEmployeeByID(int id) {
		// TODO Auto-generated method stub
		Employee employee = null;
		try {
			employee = jdbcTemplate.queryForObject("select * from employee where id=?", new Object[] {id}, new EmployeeMapperClass());
		}catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		return employee;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update employee set employeename=? , department=? , salary=? where id=?", new Object [] {
				employee.getEmployeename(), employee.getDepartment(),employee.getSalary(), id });
		return findEmployeeByID(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		jdbcTemplate.update("INSERT into employee (id, employeename, department,salary) values (?,?,?,?)",
				new Object[] {employee.getId(), employee.getEmployeename(), employee.getDepartment(),employee.getSalary()});
		return findEmployeeByID(employee.getId());
	}

	@Override
	public boolean deleteEmployee(int id) {
		return jdbcTemplate.update("delete from employee where id=?", new Object[] {id}) > 0;
	}

}
