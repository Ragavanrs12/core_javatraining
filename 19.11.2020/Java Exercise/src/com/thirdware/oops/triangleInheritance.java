package com.thirdware.oops;

public class triangleInheritance extends ShapeInheritance {
	public void area() {
		System.out.println("area of triangle"+((0.5)*(getLength()*getBreath()))); 
	}
	public void perimeter() {
		System.out.println("perimeter of triangle"+(getLength()+getBreath()+getWidth()));
	}
}
