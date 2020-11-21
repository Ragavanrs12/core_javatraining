package com.thirdware.controlstatement;

public class WhileLoop {
static int a=6,b=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop d=new WhileLoop();
		System.out.println("while loop");
		d.whileloop();
		System.out.println();
		System.out.println("do while");
		d.dowhileloop();
	}
public void whileloop() {
	while(a<10) {
		System.out.println("value of a is"+a);
		a++;
	}
}
public void dowhileloop() {
	do{
		System.out.println("value of b is"+b);
		b++;
	}while(b!=30 && b<34 );
	}
}
