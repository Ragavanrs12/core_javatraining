package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tw.assignment.Student;
@SpringBootApplication
public class SudentApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	SpringApplication.run(SudentApplication.class, args);
	ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
	Student e=context.getBean(Student.class,"st");
	System.out.println(e);
	}
}
