package com.tw.jdbcconfig;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImplementation implements StudentDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Student> getStudentsList() {
		return this.jdbcTemplate.query("select * from students", new StudentMapperClass());
	}

	@Override
	public Student findStudentByID(int studentID) {
		Student student = null;
		try {
			student = jdbcTemplate.queryForObject("select * from students where studentId=?", new Object[] {studentID}, new StudentMapperClass());
		}catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		return student;
	}

	@Override
	public Student updateStudent(int studentID, Student student) {
		jdbcTemplate.update("update students set studentName=? , studentAge=? where studentID=?", new Object [] {
				 student.getStudentName(), student.getStudentAge(), studentID });
		return findStudentByID(studentID);
	}

	@Override
	public Student addStudent(Student student) {
		jdbcTemplate.update("INSERT into students (studentID, studentName, studentAge) values (?,?,?)",
				new Object[] {student.getStudentID(), student.getStudentName(), student.getStudentAge()});
		return findStudentByID(student.getStudentID());
	}

	@Override
	public boolean deleteStudent(int studentID) {
		return jdbcTemplate.update("delete from students where studentID=?", new Object[] {studentID}) > 0;
	}


}
