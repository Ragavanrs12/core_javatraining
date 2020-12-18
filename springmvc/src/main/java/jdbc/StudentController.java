package com.thirdware.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
	StudentDao studentDao = context.getBean(StudentDao.class);
	
	//@GetMapping("/student")
	@RequestMapping(value = "/student", method = RequestMethod.GET, produces = "application/json")
	public List<Student> getList(){
		return studentDao.getStudentsList();
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		return studentDao.addStudent(student);
	}
	
	@GetMapping("/student/{studentID}")
	Student findStudent(@PathVariable Integer studentID) throws Exception{
		Student student = studentDao.findStudentByID(studentID);
		if(student == null) {
			throw new Exception("No student Found with ID number: "+studentID);
		}
		return student;
	}
	
	@PutMapping("/student/{studentID}")
	Student updateStudent(@RequestBody Student student, @PathVariable int studentID) {
		return studentDao.updateStudent(studentID, student);
	}
	
	@DeleteMapping("/student/{studentID}")
	public void delete(@PathVariable int studentID) {
		studentDao.deleteStudent(studentID);
	}
	
	
	
	
}
