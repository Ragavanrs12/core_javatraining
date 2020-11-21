//Write a program to print the sum and avg of array values
package com.thirdware.controlstatement;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a[]= {2,20,6,10,5,30,50};
		float b=0;
		for(int i=0;i<a.length;i++)
		{
			b=b+a[i];
		}
		float c=(b/a.length);
		System.out.println("sum of array is"+(int)b);
		System.out.println();
		System.out.println("average of array is"+c);
	}

}
