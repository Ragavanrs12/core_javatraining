package com.thirdware.javabasics;

public class ArithematicMethods {
	 int a=5,b=10,c=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithematicMethods obj=new ArithematicMethods();
		obj.add();
		obj.sub();
		obj.multiply();
		obj.div();
		obj.module();
		
	}
public void add() {
	System.out.println("addition:"+(a+b));
}
public void sub() {
	System.out.println("subraction:"+(b-c));
}
public void multiply() {
	System.out.println("multiplication:"+(a*b));
}
public void div() {
	
	System.out.println("division:"+(b/a));
}
public void module() {
	System.out.println("modulus:"+(b%c));
}
}
