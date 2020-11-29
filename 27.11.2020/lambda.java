package com.thirdware.collectionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class lambda {
static PersonalInfo p1,p2;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		 list.add(new PersonalInfo(3,"9840841887","nehru street",'M'));
		 list.add(new PersonalInfo(1,"3256775441","rs street",'M'));
		 list.add(new PersonalInfo(4,"3156843963","lucifer street",'M'));
		 list.add(new PersonalInfo(5,"1355369465","dark street",'F'));
		 list.add(new PersonalInfo(2,"9325836832","james street",'M'));
		    list.forEach( (n) -> { System.out.println(n); } );
//		 example of sorting using lambda  
		    TreeSet<Integer> h =  
                    new TreeSet<Integer>((o1, o2) -> (o1 > o2) ?  
                                       -1 : (o1 < o2) ? 1 : 0); 
     h.add(850); 
     h.add(235); 
     h.add(1080); 
     h.add(15); 
     h.add(5); 
     System.out.println( h); 
	    }  
	
	}
//why lambda?
//To provide the implementation of Functional interface,less coding.
//syntax: (argument-list) -> {body}  
//Argument-list: It can be empty or non-empty as well.
//Arrow-token: It is used to link arguments-list and body of expression.
//Body: It contains expressions and statements for lambda expression.

