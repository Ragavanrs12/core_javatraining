package com.tw.jdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentJdbc.xml");
		StudentDAOImpl studentdao=context.getBean(StudentDAOImpl.class);
		System.out.println(studentdao.getStudentlist());
	}

}
