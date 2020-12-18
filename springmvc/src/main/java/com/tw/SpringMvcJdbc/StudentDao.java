package com.tw.SpringMvcJdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;
@Component
public interface StudentDao {

	public Student addStudent(Student student);

	public Student editStudent(Student student, int studentID);

	public void deleteStudent(int studentID);

	public Student find(int studentID);

	public List<Student> findAll();

	List<Student> getStudentlist();

	void setDataSource(DataSource dba);

	Student getStudent(Integer i);
}
