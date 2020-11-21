package com.thirdware.controlstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,5,25};
		for(int i=0;i<a.length;i++)
		switch(a[i]) {
		case 5:System.out.println("the given number is 5");
				break;
		case 10:System.out.println("the given number is 10");
		break;
		case 15:System.out.println("the given number is 15");
		break;
		case 20:System.out.println("the given number is 20");
		break;
		default:System.out.println("invalid number");
		break;
		
		}
		}
	

}
