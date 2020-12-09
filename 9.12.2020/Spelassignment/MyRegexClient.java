package com.tw.Spelassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class MyRegexClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
		Registration e=(Registration) context.getBean("registration");
		e.setAge(19);
		e.setEmail("ragavan.rs12@gmail.com");
		
		System.out.println(e);
			//e.printValidationResults();
	}

}
