package com.thirdware.collectionpackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
public static void main(String[] args) {
	ArrayList list = new ArrayList(); 
	  
     list.add("A"); 
     list.add("B"); 
     list.add("C"); 
     list.add("D"); 
     list.add("E"); 

     // ListIterator to traverse the list 
     ListIterator iterator = list.listIterator(); 

   
     while (iterator.hasNext()) 
         System.out.print(iterator.next() + " "); 

     System.out.println(); 
     
iterator.remove();

     // Traversing the list in backward direction 
     System.out.println("Displaying list elements in backward direction : "); 

     while (iterator.hasPrevious()) 
         System.out.print(iterator.previous() + " "); 

     System.out.println(); 
}
}