package com.thirdware.tennisplayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TennisPlayer  {
private int playerCode;
private String playerName;
public PlayerCareer careerDetail ;
static	boolean val;
public TennisPlayer(int playerCode, String playerName,int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
		int lastFought) {
	super();
	this.playerCode = playerCode;
	this.playerName = playerName;
	this.careerDetail = new PlayerCareer(matchesPlayed, matchesWon, currentRanking, bestRanking, preferredCourt, lastFought);
}
public int getPlayerCode() {
	return playerCode;
}
public String getPlayerName() {
	return playerName;
}
public PlayerCareer getCareerDetail() {
	return careerDetail;
}



@Override
public String toString() {
	return "playerCode=" + playerCode + ", playerName=" + playerName + ", careerDetail=" + careerDetail;
}
//@Override
//compare to method used to sortwith get ranking
//public int compareTo(TennisPlayer o) {
//	// TODO Auto-generated method stub
//	if(this.careerDetail.getCurrentRanking()==o.careerDetail.getCurrentRanking())
//		return 0;
//	else if(this.careerDetail.getCurrentRanking()>o.careerDetail.getCurrentRanking())
//		return 1;
//	else
//	return -1;
//}
}
