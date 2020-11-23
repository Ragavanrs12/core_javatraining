package com.thirdware.exceptionpackage;
import java.util.Scanner;
public class CustomException {
static Scanner obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner obj=new Scanner(System.in);
			int a=obj.nextInt();
			if(a==0) {
				throw new Value("enter the value not equal to zero");
				
			}else {
				System.out.println("entered value is "+a);
			}
			obj.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("custom exception completed");
			
		}
	}
}
	@SuppressWarnings("serial")
	class Value extends Exception{

		public Value(String string) {
		super(string);
		}
		
		
	}


