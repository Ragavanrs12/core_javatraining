//Write a program to add objects in ArrayList
package com.thirdware.collection;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("rawtypes")
ArrayList list=new ArrayList();
list.add(new PersonalInfo(1,"9840841887","nehru street",'M'));
list.add(new PersonalInfo(2,"3256775441","rs street",'M'));
list.add(new PersonalInfo(3,"3156843963","lucifer street",'M'));
list.add(new PersonalInfo(4,"1355369465","dark street",'F'));
list.add(new PersonalInfo(5,"9325836832","james street",'M'));
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).toString());
	}

}
	
}