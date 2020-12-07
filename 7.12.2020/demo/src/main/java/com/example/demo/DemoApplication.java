package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello ragav");
//		System.out.println("rana");
//		System.out.println("rana");
		//Employee emp1=new Employee("ragav", "larry");
		//Employee emp2=new Employee("rav", "lucifer");
	//	Employee emp3=new Employee();
		//emp3.setA("ragav");
		//emp3.setB("jake");
	//	System.out.println("first employee" +emp1);
ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=context.getBean(Employee.class,"emp");
		System.out.println(e);
		//System.out.println(e.getB());
		//System.out.println(e.getDept());
	//	System.out.println("employee" +e);
//e.display();

	}

}
