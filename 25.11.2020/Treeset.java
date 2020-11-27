package com.thirdware.collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.*;
public class Treeset {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Set<PersonalInfo> list = new TreeSet<PersonalInfo>(); 
		PersonalInfo a1=new PersonalInfo(1,"phone","street",'M');
		PersonalInfo a2=new PersonalInfo(2,"phone","street",'M');
		PersonalInfo a3=new PersonalInfo(1,"phones","street",'M');
		PersonalInfo a4=new PersonalInfo(2,"phone","street",'F');
		PersonalInfo a5=new PersonalInfo(2,"phone","streetS",'M');
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
	for(PersonalInfo a:list) {
			System.out.println(a1.id+" "+a1.phone+" "+a1.address+" "+a1.gender);
		}
		
	}

}
