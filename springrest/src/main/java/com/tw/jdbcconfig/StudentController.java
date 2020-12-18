package com.thirdware.jdbcdao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	StudentDao studentDao = context.getBean(StudentDao.class);
	
	@GetMapping("/student")
	public List<Student> getList(){
		return studentDao.findAll();
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		return studentDao.addStudent(student);
	}
	
	@PutMapping("/student/{studentID}")
	Student updateStudent(@RequestBody Student student, @PathVariable int studentID) {
		return studentDao.editStudent(student, studentID);
	}
	@DeleteMapping("/student/{studentID}")
	public void delete(@PathVariable int studentID) {
		studentDao.deleteStudent(studentID);
	}
}
