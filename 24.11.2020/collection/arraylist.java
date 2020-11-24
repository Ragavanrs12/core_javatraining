package com.thirdware.collection;
import java.util.ArrayList;
public class arraylist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("rawtypes")
ArrayList list=new ArrayList();
list.add(1);
list.add("hello");
list.add(32);
list.add(95);
list.add(4.3);
list.add("we are the array list");
System.out.println(list);
list.remove(2);
list.add(2, "this is ragav");
System.out.println(list);
list.remove(4.3);
System.out.println(list);
	}

}
