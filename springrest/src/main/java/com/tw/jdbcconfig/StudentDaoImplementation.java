package com.thirdware.jdbcdao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImplementation implements StudentDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource dataSource;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT into student (studentID, studentName, studentAge) values (?,?,?)",
				student.getStudentID(), student.getStudentName(), student.getStudentAge());
		System.out.println("Student Added");
	}

	@Override
	public void editStudent(Student student, int studentID) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update student set studentName=? , studentAge=? where studentID=?",
			 student.getStudentName(), student.getStudentAge(), studentID);
		System.out.println("Student Updated");
	}

	@Override
	public void deleteStudent(int studentID) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from student where studentID=?",studentID);
		System.out.println("Student Deleted");
	}

	@Override
	public Student find(int studentID) {
		// TODO Auto-generated method stub
		Student student = (Student) jdbcTemplate.queryForObject("select * from student where studentId=?",
				new Object[] {studentID}, new BeanPropertyRowMapper<>(Student.class));
		return student;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> studentList = jdbcTemplate.query("Select * from student", new BeanPropertyRowMapper(Student.class));
		return studentList;
	}

}
