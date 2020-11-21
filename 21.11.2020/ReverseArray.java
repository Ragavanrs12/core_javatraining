//Write a program to reverse the values of array.
package com.thirdware.controlstatement;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,20,6,10,5,30,50};
		int c=0;
		System.out.println("before reversing the array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		
		for(int i=0,b=a.length-1;i<b;i++,b--) {
			c=a[i];
			a[i]=a[b];
			a[b]=c;
		}
		System.out.println("reverse the array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ "  ");
		}
		
	}

}
