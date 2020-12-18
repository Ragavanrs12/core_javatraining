package com.tw.SpringMvcJdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tw.springmvc.StudentMainClass;
@SpringBootApplication
public class MainDriverClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao studentDao = context.getBean(StudentDao.class);

		System.out.println("Add students to DB");
		studentDao.addStudent(new Student(1, "Nitin", 24));
		studentDao.addStudent(new Student(2, "Nirmal", 23));
		studentDao.addStudent(new Student(3, "Pradeep", 23));
		studentDao.addStudent(new Student(4, "Joel", 23));
		studentDao.addStudent(new Student(5, "Arun", 23));

		System.out.println("Get all data");
		List<Student> studentList = studentDao.findAll();
		for (Student student : studentList) {
			System.out.println(student.toString());
		}

		System.out.println("Delete id = 2");
		studentDao.deleteStudent(2);

		System.out.println("Find Person data with id 5");
		System.out.println(studentDao.find(5).toString());
	}

}
