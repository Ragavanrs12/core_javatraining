package com.tw.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
	@After("tackle()")
	public void message() {
		System.out.println("Get Method call");
	}
	@After("tackle()")
	public void value() {
		System.out.println("Get value call");
	}
	@Before("tackle()")
	public void standard() {
		System.out.println("Get standard call");
	}
	@Pointcut("execution(public String  getName())")
	public void tackle() {
		
	}

}

