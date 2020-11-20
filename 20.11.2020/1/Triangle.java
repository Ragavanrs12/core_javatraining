package com.thirdware.interface_inheritance;

public class Triangle implements Shape {
	public void area() {
		System.out.println("area of triangle"+(l+b)/2); 
	}
	public void perimeter() {
		System.out.println("perimeter of triangle"+(l+b+h));
	}
}
