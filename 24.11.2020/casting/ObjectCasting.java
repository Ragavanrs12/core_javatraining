//Write a program to implement for object casting
package com.thirdware.casting;

public class ObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion a=new animal();
		lion b=new lion();
		@SuppressWarnings("unused")
		animal c=new animal();
		//animal c =new lion();
		a.roar();
		b.roar();
		
		
	}
		
}
