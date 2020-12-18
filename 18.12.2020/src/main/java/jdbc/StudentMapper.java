package com.thirdware.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class StudentMapper implements RowMapper<Student> {
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setStudentID(rs.getInt("studentID"));
		student.setStudentName(rs.getString("studentName"));
		student.setStudentAge(rs.getInt("studentAge")) ;
		return student;
	}
}
