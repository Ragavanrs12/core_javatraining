//Write a program  to implement for autoboxing and Unboxing
package com.thirdware.casting;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		@SuppressWarnings("unused")
		int y=20;
		Integer a=25;//auto-boxing
		Integer b=x;//unboxing
		int z=a;
		System.out.println(b);
		System.out.println(z);
	}

}
