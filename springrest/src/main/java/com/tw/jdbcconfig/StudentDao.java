package com.thirdware.jdbcdao;

import java.util.List;

public interface StudentDao {
	public Student addStudent(Student student);

	public Student editStudent(Student student, int studentID);

	public void deleteStudent(int studentID);

	public Student find(int studentID);

	public List<Student> findAll();
}
