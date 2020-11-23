package com.thirdware.exceptionpackage;
import java.util.Scanner;
public class StringReverse {
static Scanner obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse ab=new StringReverse();
		try {
			Scanner obj=new Scanner(System.in);
			String str=obj.next();
			//String s=null;
			//System.out.println(s);
			String reverse =ab.rev(str);

			System.out.println(reverse);
			obj.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}
	public String rev(String str) throws Check {
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>='0'&& a[i]<='9') 
				throw new Check("enter the character");
		}
		String c="";
		for(int i=str.length()-1;i>=0;i--) {
			c+=a[i];
		}
		return c;
		
	}
	
	
	
}
class Check extends Exception{

	public Check(String string) {
		super(string);
	}
	
}
