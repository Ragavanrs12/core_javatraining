package com.thirdware.assignment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeFinancials abc=new EmployeeFinancials();
		Employee em=new Employee(1, "984084187", "nehru street", 'M', "john",30000, 01, "eee");
		System.out.println(em);
		System.out.println(em + " "+ "incremented salary "+ abc.Updatedannualsalary(em));
		System.out.println(em + " "+"income tax "+ abc.taxincome(em));
		Employee em2=new Employee(2, "984084187", "nehru street", 'F', "jonna",30000, 02, "ece");
		System.out.println(em2);
		System.out.println(em2 + " "+ "incremented salary "+ abc.Updatedannualsalary(em2));
		System.out.println(em2 + " "+"income tax "+ abc.taxincome(em2));
	}

	

}
