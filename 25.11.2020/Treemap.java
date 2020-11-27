//Write a program to add objects to Map, TreeMap and LinkedHashMap.
package com.thirdware.collection;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("rawtypes")
TreeMap list=new TreeMap();
list.put(1,new PersonalInfo(1,"9840841887","nehru street",'M'));
list.put(2,new PersonalInfo(2,"3256775441","rs street",'M'));
list.put(3,new PersonalInfo(3,"3156843963","lucifer street",'M'));
list.put(4,new PersonalInfo(4,"1355369465","dark street",'F'));
list.put(5,new PersonalInfo(5,"9325836832","james street",'M'));
	
	for(int i=1;i<=list.size();i++) {
		System.out.println(list.get(i));
	}

}
}
