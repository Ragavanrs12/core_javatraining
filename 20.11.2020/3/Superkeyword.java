//3. Write a program to implement the concept of super() method, super as keyword, this keyword and static keyword in case of methods and variables.

package com.thirdware.interface_inheritance;

public class Superkeyword {
	int c=10;
	static int ab=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super a=new Super();
Superkeyword d=new Superkeyword();
System.out.println(" c ="+d.c);
d.value(15);
System.out.println(" c ="+d.c);
d.val(100);
System.out.println(" c ="+d.c);
System.out.println(" ab="+ab);
	}
	public void value(int c) {
		c=c+10;
	}
	public void val(int b) {
		this.c=b+10;
	}

}
