//1. Rewrite the program of inheritance with Shape class as Interface and implement the interface in Triangle and Rectangle Classes to find area and perimeter.

package com.thirdware.interface_inheritance;

public class Driver_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle();
		Triangle tri=new Triangle();
		rec.area();
		rec.perimeter();
		tri.area();
		tri.perimeter();
	}

}
