package com.thirdware.collectionpackage;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
static Redbus em;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();
		list.add(new Redbus("steve", 1, 10, 22, 7));
		list.add(new Redbus("lucifer", 2, 7, 20, 1));
		list.add(new Redbus("steve", 3, 5, 10, 7));
		list.add(new Redbus("steve", 1, 7, 20, 9));
		list.add(new Redbus("steve", 1, 8, 22, 4));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
