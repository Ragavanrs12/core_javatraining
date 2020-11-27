package com.thirdware.collection;

import java.util.LinkedHashSet;

//import com.thirdware.assignment.Employee;
//import com.thirdware.assignment.PersonalInfo;

@SuppressWarnings("unused")
public class LinkedHashSetObject {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		LinkedHashSet list=new LinkedHashSet();
		list.add(new PersonalInfo(1,"phone","street",'M'));
		list.add(new PersonalInfo(2,"phone","street",'M'));
		list.add(new PersonalInfo(1,"phones","street",'M'));
		list.add(new PersonalInfo(2,"phone","street",'F'));
		list.add(new PersonalInfo(2,"phone","streetS",'M'));
		System.out.println(list.toString());
	}

}
