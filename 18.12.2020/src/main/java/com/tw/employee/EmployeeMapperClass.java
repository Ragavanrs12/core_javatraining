package com.tw.employee;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperClass implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setId(rs.getInt("id"));
		employee.setEmployeename(rs.getString("employeename"));
		employee.setDepartment(rs.getString("department"));
		employee.setSalary(rs.getInt("salary"));
		return employee;
	}
}
