package com.thirdware.controlstatement;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop a=new ForLoop();
		System.out.println("for loop");
		a.forloop();
		System.out.println();
		System.out.println("nested for");
		a.nestedfor();
	}
	public void forloop() {
		for(int i=1;i<10;i++)
		{
			System.out.println("the given number is " +i);
		}
		return;
	}
	public void nestedfor() {
		for(int x=1;x<5;x++)
		{
			for(int y=0;y<x;y++) {
				System.out.print(y+1);
			}
			System.out.println();
		}
		return;
	}

}
