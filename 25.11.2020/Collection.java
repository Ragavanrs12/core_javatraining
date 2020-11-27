package com.thirdware.collection;

import java.util.LinkedList;

public class Collection {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("rawtypes")
LinkedList abc=new LinkedList();
	abc.add(12);
	abc.add(123);
	abc.add(12.5);
	abc.add("this is rocking");
	abc.add(92);
	abc.add('c');
	System.out.println(abc);
	abc.remove(1);
	abc.add(3, "hello");
	System.out.println(abc);

	}

}
