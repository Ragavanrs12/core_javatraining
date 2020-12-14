package com.tw.aop;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tw.annotation.MyAppConfig;
import com.tw.annotation.Student;
@SpringBootApplication
public class mainJava {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(MySimConfig.class);
		Simcard e1=(Simcard) context.getBean("Simcard");
		System.out.println(e1.getPostpaid().getName());

	}

}
