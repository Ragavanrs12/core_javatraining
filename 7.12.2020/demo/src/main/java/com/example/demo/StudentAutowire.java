package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tw.assignment.Student;
@SpringBootApplication
public class StudentAutowire {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	SpringApplication.run(StudentAutowire.class, args);
	ApplicationContext context=new ClassPathXmlApplicationContext("studentAutowire.xml");
	Student e=context.getBean(Student.class,"st");
	e.display();
	}
}
