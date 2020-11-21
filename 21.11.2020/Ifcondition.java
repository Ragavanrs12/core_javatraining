package com.thirdware.controlstatement;

public class Ifcondition {
static int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ifcondition a=new Ifcondition();
System.out.println("if condition");
a.ifcondition();
System.out.println();
System.out.println("if-else condition");
a.ifelsecondition();
System.out.println();
System.out.println("nested-if condition");
	a.nestedifcondition();
	System.out.println();
	}
public void ifcondition() {
	if(x==10)
	{
		System.out.println("if condition satisfies x==10");
		return;
	}
	System.out.println("if condition fails");
}
public void ifelsecondition() {
	if(x==10)
	{
		System.out.println("if condition satisfies x==10");
		
	}else {
	System.out.println("if condition fails");
}
}
	public void nestedifcondition() {
		if(x<20)
		{	if(x<=10)
				System.out.println("if condition satisfies x<=10");
			else
				System.out.println("nested if condition says x>10");
			
		}else {
		System.out.println("if condition fails");
	}

}
	
}
