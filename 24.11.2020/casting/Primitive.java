//Write a program  to implement for primitive variable casting.
package com.thirdware.casting;

public class Primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=49;
		double y=10;
		short z=12;
		byte a=(byte)x;//explicit typecasting
		double b=x;//implicit typecasting
		long d=(long)y;
		char c=(char)x;//explicit typecasting
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
