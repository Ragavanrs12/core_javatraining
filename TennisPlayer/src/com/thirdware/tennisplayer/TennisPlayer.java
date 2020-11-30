package com.thirdware.tennisplayer;
import java.util.Random;

public class TennisPlayer implements Comparable<TennisPlayer> {
private int playerCode;
private String playerName;
public PlayerCareer careerDetail ;
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
public  int playMatch(int playerCode) {
	Random value=new Random();
	boolean val=value.nextBoolean();
	if(val)
		return 1;
	else
		return -1;
	
}
public void currentranking(TennisPlayer tm) {
	int a=tm.playMatch(this.playerCode);
	if(a==1)
		{int b=careerDetail.getCurrentRanking()-1;
		careerDetail.setCurrentRanking(b);
		}
	else {
		int b=careerDetail.getCurrentRanking()+1;
		careerDetail.setCurrentRanking(b);
		}
}


@Override
public String toString() {
	return "TennisPlayer [playerCode=" + playerCode + ", playerName=" + playerName + ", careerDetail=" + careerDetail
			+ "]";
}
@Override
public int compareTo(TennisPlayer o) {
	// TODO Auto-generated method stub
	if(this.careerDetail.getCurrentRanking()==o.careerDetail.getCurrentRanking())
		return 0;
	else if(this.careerDetail.getCurrentRanking()>o.careerDetail.getCurrentRanking())
		return 1;
	else
	return -1;
}
}
