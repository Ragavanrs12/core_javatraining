package com.thirdware.javabasics;

public class Operators {
static int x=10,y=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("assignment operator");
		System.out.println("x+=y is "+(x+=y));//x=x+y//15
		System.out.println("x-=y is "+(x-=y));//x=x-y//5
		System.out.println("x*=y is "+(x*=y));//x=x*y//50
		System.out.println("x/=y is "+(x/=y));//x=x/y//10
		System.out.println("x%=y is "+(x%=y));//x=x%y//0
		System.out.println("x&=y is "+(x&=y));//x=x & y //0
		System.out.println("x|=y is "+(x|=y));//x=x|y//5

		System.out.println("increment/decrement operator");
		System.out.println("post-increment: of x"+(x++));//declared then incremented//5
		System.out.println("pre-increment: of x"+(++x));//incremented and declared//7
		System.out.println("post-decrement:of y "+(y--));//declared and decremented//5
		System.out.println("pre-decrement: of y"+(--y));//decremented and declared//3
		
		System.out.println("comparison operator");
		System.out.println("x==y is "+(x==y));//if x equal to y//false
		System.out.println("x!=y is "+(x!=y));//if x not equal to y//true
		System.out.println("x<y is "+(x<y));//if x greater than y//false
		System.out.println("x>y is "+(x>y));//if x less than y//true
		System.out.println("x>=y is "+(x>=y));//if x greater than or equal to y//true
		System.out.println("x<=y is "+(x<=y));//if x less than or equal to y//false
		
		System.out.println("logical operator");
		System.out.println("x!=y && x>=y is "+(x!=y && x>=y));//if both condition true then true//true
		System.out.println("x!=y || x<=y is "+(x!=y || x<=y));//if any one condition true then true//true
		System.out.println("!(x!=y || x<=y) is "+!(x!=y || x<=y));//not of given condition//false
		
		System.out.println("Bitwise operator");
		System.out.println("x&y is "+(x&y));//and operator//3
		System.out.println("x|y is "+(x|y));//or operator//7
		System.out.println("~x is "+~x);//compliment operator//-8
		System.out.println("x>>y is "+(x>>y));//left shift operator//0
		System.out.println("x<<y is "+(x<<y));//right shift operator//56
		System.out.println("x^y is "+(x^y));//xor operator//4
	}

}
