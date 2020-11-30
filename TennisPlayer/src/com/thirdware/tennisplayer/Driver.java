package com.thirdware.tennisplayer;

import java.util.*;


public class Driver {
	static Driver div;
static TennisPlayer player; 
static int delete;
static Scanner obj=new Scanner(System.in);
static ArrayList<TennisPlayer> set=new ArrayList();
static LinkedHashSet view=new LinkedHashSet();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		set.add(new TennisPlayer(1, "aaa", 5, 2, 2, 2, "Grass", 4));
		set.add(new TennisPlayer(2, "bb", 3, 2,3 , 1, "Synthetic",7 ));
		set.add(new TennisPlayer(3, "cc", 1, 5, 9, 3, "clay", 5));
		set.add(new TennisPlayer(4, "dd", 4, 1, 3, 2, "Synthetic", 3));
		set.add(new TennisPlayer(5, "ee", 6, 2, 4, 1, "Grass", 10));
		set.add(new TennisPlayer(6, "ff", 2, 7, 7, 1, "Grass", 2));
		set.add(new TennisPlayer(7, "gg", 1, 7, 6, 7, "Grass", 4));
		set.add(new TennisPlayer(8, "hh", 1, 1, 1, 2, "Grass", 8));
		set.add(new TennisPlayer(9, "ii", 2, 3, 10, 4, "Grass", 6));
		set.add(new TennisPlayer(10, "jj", 3, 3, 8, 5, "Grass", 1));

		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i));
		}
		System.out.println("please enter the value to be submitted");
		delete=obj.nextInt();
		int x=0;
		for(TennisPlayer a:set) {
			if(a.getPlayerCode()==delete)
				delete=x;
			x++;
		}
		if(delete!=0) {
			
			deletePlayer(delete);
			for(int i=0;i<set.size();i++)
			{
				System.out.println(set.get(i));
			}	
		}
		System.out.println();
for(int i=0;i<set.size();i++) {
		view.add(set.get(i));}
				
			System.out.println(view.toString());
		
		Collections.sort(set);
		System.out.println();
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i));
		}	
	}
	

	public static void deletePlayer(int delete) {
		set.remove(delete);
	}
}
