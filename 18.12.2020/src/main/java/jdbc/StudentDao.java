package com.thirdware.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public interface StudentDao {
	public List<Student> getStudentsList();

	public void setDataSource(DataSource dba);
	
	public Student findStudentByID(int studentID);
	
	public Student updateStudent(int studentID,Student student);
	
	public Student addStudent(Student student);
	
	public boolean deleteStudent(int studentID);
}
