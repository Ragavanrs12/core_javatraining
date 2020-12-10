package com.tw.jdbcdemo;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDao {

	public List<Student> getStudentlist();

	public void setDataSource(DataSource dba);
	public Student getStudent(Integer i);
}
