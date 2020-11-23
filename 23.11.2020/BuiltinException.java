package com.thirdware.exceptionpackage;

import java.lang.StackWalker.Option;
import java.lang.annotation.IncompleteAnnotationException;
import java.util.*;

public class BuiltinException {

	public static void main(String[] args) {
		BuiltinException a = new BuiltinException();
		a.arithematicexception();
		a.nullpointerexception();
		a.numberformatexception();
		a.arrayIndexOutOfBoundsException();
		a.stringIndexOutOfBound_Demo();
		a.arrayStoreException();
		a.negativearraysizeexception();
		a.illegalStateExceptionTest();
	}
public void arithematicexception() {
	int a=5,b=0;
	try { 
        
        System.out.println ("Result = " + a/b); //Arithmetic exception due to a divided y zero
        
    } 
    catch(ArithmeticException e) { 
        System.out.println ("Can't divide a number by 0"); 
    } 
	
}
public void nullpointerexception() {
	String a=null;
try { 
        
        System.out.println ("Result = " + a.length()); //
        
    }catch(NullPointerException e) { 
        System.out.println("NullPointerException.."); 
    } 
}
public void numberformatexception() {
	
try { 
	int num = Integer.parseInt (null) ; 
        System.out.println ("Result = " + num);
        
    }catch(NumberFormatException e) { 
        System.out.println("Number format exception"); 
     } 
}
public void arrayIndexOutOfBoundsException() {
	 try{
         int arr[]=new int[7];
         arr[10]=10/5;
         System.out.println("Last Statement of try block");
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Accessing array elements outside of the limit");
       }
}
public void stringIndexOutOfBound_Demo() {
	try { 
        String a = "This is java class "; 
        char c = a.charAt(24); // accessing  25th element of string a 
        System.out.println(c); 
    } 
    catch(StringIndexOutOfBoundsException e) { 
        System.out.println("StringIndexOutOfBounds Exception"); 
    } 
}
public void arrayStoreException() {
	try { 
		  
        Object a[] = new Double[2]; 
        a[0] = 4; 
        
    }  catch (ArrayStoreException e) { 
    	  
       
        System.out.println("ArrayStore Exception "); 
    }  
}
public void negativearraysizeexception() {
	try {
		int[] arr=new int[-10];
	}catch(NegativeArraySizeException e){
		System.out.println("Negative array size exception"); 
	}
}
public void illegalStateExceptionTest() {
	try {
		List list = new LinkedList();
	      ListIterator lIterator = list.listIterator();
	      lIterator.set("Tutorix");//modifying the list rises the illegal state error
	      System.out.println(list);
	}catch(IllegalStateException e) {
		System.out.println("Illegal State Exception"); 
	}
}

}


