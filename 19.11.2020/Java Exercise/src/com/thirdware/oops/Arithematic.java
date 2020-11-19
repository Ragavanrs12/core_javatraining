package com.thirdware.oops;

public class Arithematic {
	
	public static void main(String args[]) {
		
	
	int a,b;
	OperatorEncapsulate name = new OperatorEncapsulate();
	name.setA(10);
	name.setB(20);
	a=name.getA();
	b=name.getB();
	System.out.println();
	name.Arithematic();
	System.out.println();
	name.Assignment();
	System.out.println();
	name.Bitwise();
	System.out.println();
	name.Comparison();
	System.out.println();
	name.Increment();
	System.out.println();
	name.Logical();
		}
	}
