package com.thirdware.oops;

public class OperatorEncapsulate {
private int a,b;

	public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public void Arithematic() {
	System.out.println("subraction:"+(b-a));
	System.out.println("multiplication:"+(a*b));
	System.out.println("division:"+(b/a));
	System.out.println("modulus:"+(b%a));
	System.out.println("increment:"+(++a));
	System.out.println("decrement:"+(--b));

}
public void Assignment() {
	System.out.println("a+=b is "+(a+=b));
	System.out.println("a-=b is "+(a-=b));
	System.out.println("a*=b is "+(a*=b));
	System.out.println("a/=b is "+(a/=b));
	System.out.println("a%=b is "+(a%=b));
	System.out.println("a&=b is "+(a&=b));
	System.out.println("a|=b is "+(a|=b));

}
public void Increment() {
	System.out.println("increment/decrement operator");
	System.out.println("post-increment: of a"+(a++));
	System.out.println("pre-increment: of a"+(++a));
	System.out.println("post-decrement:of b "+(b--));
	System.out.println("pre-decrement: of b"+(--b));

}
public void Comparison() {
	System.out.println("comparison operator");
	System.out.println("a==b is "+(a==b));
	System.out.println("a!=b is "+(a!=b));
	System.out.println("a<b is "+(a<b));
	System.out.println("a>b is "+(a>b));
	System.out.println("a>=b is "+(a>=b));
	System.out.println("a<=b is "+(a<=b));
	
}
public void Logical() {
	System.out.println("logical operator");
	System.out.println("a!=b && a>=b is "+(a!=b && a>=b));
	System.out.println("a!=b || a<=b is "+(a!=b || a<=b));
	System.out.println("!(a!=b || a<=b) is "+!(a!=b || a<=b));
	
}
public void Bitwise() {
	System.out.println("Bitwise operator");
	System.out.println("a&b is "+(a&b));
	System.out.println("a|b is "+(a|b));
	System.out.println("~a is "+~a);
	System.out.println("a>>b is "+(a>>b));
	System.out.println("a<<b is "+(a<<b));
	System.out.println("a^b is "+(a^b));
}
}
