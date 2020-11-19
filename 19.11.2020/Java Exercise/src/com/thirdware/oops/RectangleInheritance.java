package com.thirdware.oops;

public class RectangleInheritance extends ShapeInheritance {
public void area() {
	System.out.println("area of rectangle"+getLength()*getBreath()); 
}
public void perimeter() {
	System.out.println("perimeter of rectangle"+2*(getLength()+getWidth()));
}
}
