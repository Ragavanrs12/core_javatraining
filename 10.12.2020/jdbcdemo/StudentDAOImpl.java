package com.tw.jdbcdemo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDao {
	private DataSource dataSource;
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Student> getStudentlist() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		List<Student> studentlist=this.jdbctemplate.query(sql, new StudentMapperClass());
		return studentlist;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jdbctemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public Student getStudent(Integer i) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
