package com.tw.SpringMvcJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class StudentMapperClass implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setStudentid(rs.getInt("studentid"));
		student.setStudentname(rs.getString("studentname"));
		student.setMarks(rs.getInt("marks"));
		return student;
	}

}
