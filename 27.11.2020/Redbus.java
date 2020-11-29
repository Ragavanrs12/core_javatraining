//Write a program to implement online booking similar to red bus: with variables as name, id, duration, reaching,
//seats. Create a separate comparator  class for sorting the bus class members based on name, no of seats, 
//available and duration.
package com.thirdware.collectionpackage;

public class Redbus implements Comparable<Redbus> {
	private String name;
	private int id;
	private float duration,reaching,available_seat;
	public Redbus(String name, int id, float duration, float reaching, float available_seat) {
		super();
		this.name = name;
		this.id = id;
		this.duration = duration;
		this.reaching = reaching;
		this.available_seat = available_seat;
	}
	@Override
	public String toString() {
		return "Redbus [name=" + name + ", id=" + id + ", duration=" + duration + ", reaching=" + reaching
				+ ", available_seat=" + available_seat + "]";
	}
	@Override
	public int compareTo(Redbus o) {
		// TODO Auto-generated method stub
		if(this.name==o.name)
		{
			if(this.available_seat==o.available_seat) {
			if(this.duration==o.duration) {
				return 0;
			}else if(this.duration>o.duration)
				return 1;
			else
				return -1;
		}else if(this.available_seat>o.available_seat)
			return 1;
		else
			return -1;	
		
		}
		else if(stringCompare(this.name,o.name)>0) {
			
		}
		return id;
	}
		   public static int stringCompare(String str1, String str2) 
		    { 
		  
		        int l1 = str1.length(); 
		        int l2 = str2.length(); 
		        int lmin = Math.min(l1, l2); 
		  
		        for (int i = 0; i < lmin; i++) { 
		            int str1_ch = (int)str1.charAt(i); 
		            int str2_ch = (int)str2.charAt(i); 
		  
		            if (str1_ch != str2_ch) { 
		                return str1_ch - str2_ch; 
		            } 
		        } 
		  
		       
		        if (l1 != l2) { 
		            return l1 - l2; 
		        } 
		  
		    
		        else { 
		            return 0; 
		        } 
		    } 
		
	}
	


