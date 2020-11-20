package com.thirdware.interface_inheritance;

public class Rectangle implements Shape {
	public void area() {
		System.out.println("area of rectangle"+(l*b)); 
	}
	public void perimeter() {
		System.out.println("perimeter of rectangle"+2*(l+b));
	}
}
