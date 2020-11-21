package com.thirdware.controlstatement;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ragavan",b="ragavan",c="nirmal",str="ragavan is good boy   ",i="rag";
		char d='g';
		System.out.print("charAt: ");
		System.out.println(a.charAt(2));
		System.out.print("compareTo : ");
		System.out.println(a.compareTo(b));
		System.out.print("concat : ");
		System.out.println(c.concat(a));
		System.out.print("indexOf : ");
		System.out.println(b.indexOf(d));
		System.out.print("trim : ");
		System.out.println(str.trim());
		System.out.print("endsWith : ");
		System.out.println(b.endsWith("n"));
		System.out.print("isEmpty : ");
		System.out.println(b.isEmpty());
		System.out.print("contains : ");
		System.out.println(b.contains(i));
		String time = String.join(":", "12","10","10"); 
		System.out.print("join : "); 
		System.out.println(" "+time);
		System.out.print("length : ");
		System.out.println(b.length());
	}

}
