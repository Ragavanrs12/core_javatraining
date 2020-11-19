//3.Shape, Triangle, Rectangle, and Driver to establish Inheritance, And logic to find the area and perimeter of the triangle and rectangle.
package com.thirdware.oops;

public class DriverInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleInheritance rec=new RectangleInheritance();
		triangleInheritance tri=new triangleInheritance();
		rec.area();
		rec.perimeter();
		tri.area();
		tri.perimeter();
	}

}
