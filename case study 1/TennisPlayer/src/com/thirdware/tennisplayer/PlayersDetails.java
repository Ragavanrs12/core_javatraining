package com.thirdware.tennisplayer;

import java.util.*;




public class PlayersDetails {
static int a,b,d;
static public PlayersDetails div;
static public TennisPlayer player; 
static public int delete,win;
static public Scanner obj=new Scanner(System.in);
static public ArrayList<TennisPlayer> set=new ArrayList();
static public LinkedHashSet view=new LinkedHashSet();
static public boolean val;
	public static void main(String[] args) {
		
		set.add(new TennisPlayer(1, "ragav", 5, 2, 2, 2, "Grass", 4));
		set.add(new TennisPlayer(2, "john", 3, 2,3 , 1, "Synthetic",7 ));
		set.add(new TennisPlayer(3, "james", 1, 5, 9, 3, "clay", 5));
		set.add(new TennisPlayer(4, "joel", 4, 1, 5, 2, "Synthetic", 3));
		set.add(new TennisPlayer(5, "nitin", 6, 2, 4, 1, "Grass", 10));
		set.add(new TennisPlayer(6, "arun", 2, 7, 7, 1, "Grass", 2));
		set.add(new TennisPlayer(7, "pradeep", 1, 7, 6, 7, "Grass", 4));
		set.add(new TennisPlayer(8, "venkat", 1, 1, 1, 2, "Grass", 8));
		set.add(new TennisPlayer(9, "hari", 2, 3, 10, 4, "Grass", 6));
		set.add(new TennisPlayer(10, "lucifer", 3, 3, 8, 5, "Grass", 1));
		
		System.out.println("the tennis players are");
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i));
		}
		
		int c=1;
		while(c==1)
		{
			System.out.println("1.play a match between players");
			System.out.println("2.delete the player using player code");
			System.out.println("3.sorting the players");
			System.out.println("4.enter to close the file");
			System.out.println("enter your choice");
			d=obj.nextInt();
			switch(d) {
			case 1:match();
			break;
			case 2:delete();
			break;
			case 3:Collections.sort(set,new Playerrank());
			display();
			break;
			case 4:c=0;
			break;
			}
		}
		
	
	
		
		
	}
	

private static void display() {
		// TODO Auto-generated method stub
	System.out.println("After Sorting the player list respect to current ranking");
	for(int i=0;i<set.size();i++)
	{
		System.out.println(set.get(i));
	}	

	}


//	private static void sort() {
//		// TODO Auto-generated method stub
//		Collections.sort(set);
//		System.out.println();
//		System.out.println("After Sorting the player list respect to current ranking");
//		for(int i=0;i<set.size();i++)
//		{
//			System.out.println(set.get(i));
//		}	
//	}


	private static void delete() {
		// TODO Auto-generated method stub
		//to delete the player using player code
		System.out.println("please enter the player code that to be deleted");
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
	}


	private static void match() {
		// TODO Auto-generated method stub
	System.out.println("enter player 1");
	a=obj.nextInt();
	System.out.println("enter player 2");
	b=obj.nextInt();
		player(a,b,set);
		System.out.println();
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i));
		}
	}


	public static void deletePlayer(int delete) {
		set.remove(delete);
	}
	
	//class to get the two player playing match
	public static  void player(int player1,int player2,ArrayList<TennisPlayer> set) {
		Random value=new Random();
		 val=value.nextBoolean();
		
		//System.out.println("hi");
		TennisPlayer player01 = null,player02=null,player03=null,player04=null,player05=null,player06=null;
		
		
		for (TennisPlayer s:set) {
			

			if (s.getPlayerCode() == player1) {
				player01 = s;
			}

		}
		//System.out.println("hi");
	for (TennisPlayer s:set) {
			
	
			if (s.careerDetail.getCurrentRanking() == ((player01.getCareerDetail().getCurrentRanking())+1)) {
				player03 = s;
			}
	
		}
	for (TennisPlayer s:set) {
		
	
		if (s.careerDetail.getCurrentRanking() == ((player01.getCareerDetail().getCurrentRanking())-1)) {
			player04 = s;
		}
	
	}
		for (TennisPlayer s:set) {
			

			if (s.getPlayerCode() == player2){
				player02 = s;
				
			}
			}
	for (TennisPlayer s:set) {
			
	
			if (s.careerDetail.getCurrentRanking() == ((player02.getCareerDetail().getCurrentRanking())+1)) {
				player05 = s;
			}
	
		}
	for (TennisPlayer s:set) {
		
	
		if (s.careerDetail.getCurrentRanking() == ((player02.getCareerDetail().getCurrentRanking())-1)) {
			player06 = s;
		}
	
	}
		playerWoned(player01,player02,player03,player04,player05,player06);
	}
	public static void playerWoned(TennisPlayer player01,TennisPlayer player02,TennisPlayer player03,TennisPlayer player04,TennisPlayer player05,TennisPlayer player06)
	{	player01.careerDetail.setMatchesPlayed((player01.careerDetail.getMatchesPlayed())+1);//increasing the paricular player matchplayed
		player02.careerDetail.setMatchesPlayed((player02.careerDetail.getMatchesPlayed())+1);//increasing the paricular player matchplayed
		
		if(val)
		{
			
		player01.careerDetail.setMatchesWon((player01.careerDetail.getMatchesWon())+1);//increasing the paricular player matches won
	if(player01.careerDetail.getCurrentRanking()!=1) {
		player04.careerDetail.setCurrentRanking((player01.careerDetail.getCurrentRanking()));
		player01.careerDetail.setCurrentRanking((player01.careerDetail.getCurrentRanking())-1);}
	if(player02.careerDetail.getCurrentRanking()!=10) {
		player05.careerDetail.setCurrentRanking((player02.careerDetail.getCurrentRanking()));
		player02.careerDetail.setCurrentRanking((player02.careerDetail.getCurrentRanking())+1);
}
		player01.careerDetail.setLastFought(player02.getPlayerCode());
		player02.careerDetail.setLastFought(player01.getPlayerCode());
		if(player01.careerDetail.getBestRanking()>player01.careerDetail.getCurrentRanking()) {
			player01.careerDetail.setBestRanking(player01.careerDetail.getCurrentRanking());
		}
		
		}
		else
		{
			
			player02.careerDetail.setMatchesWon((player02.careerDetail.getMatchesWon())+1);//increasing the paricular player match won
			if(player01.careerDetail.getCurrentRanking()!=10) {
			player03.careerDetail.setCurrentRanking(player01.careerDetail.getCurrentRanking());
			player01.careerDetail.setCurrentRanking((player01.careerDetail.getCurrentRanking())+1);}
			if(player02.careerDetail.getCurrentRanking()!=1) {
			player06.careerDetail.setCurrentRanking((player02.careerDetail.getCurrentRanking()));
			player02.careerDetail.setCurrentRanking((player02.careerDetail.getCurrentRanking())-1);}
			player01.careerDetail.setLastFought(player02.getPlayerCode());
			player02.careerDetail.setLastFought(player01.getPlayerCode());
			if(player02.careerDetail.getBestRanking()>player02.careerDetail.getCurrentRanking()) {
				player02.careerDetail.setBestRanking(player02.careerDetail.getCurrentRanking());
			}
				
		
		}
	}
}
