package com.thirdware.tennisplayer;

public class PlayerCareer {
	private int matchesPlayed;  
	private int matchesWon; 
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}
	private int currentRanking;
	private int bestRanking;
	private String preferredCourt; 
	private int lastFought;
	
	public PlayerCareer(int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.currentRanking = currentRanking;
		this.bestRanking = bestRanking;
		this.preferredCourt = preferredCourt;
		this.lastFought = lastFought;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public int getMatchesWon() {
		return matchesWon;
	}
	public int getCurrentRanking() {
		return currentRanking;
	}
	public void setCurrentRanking(int currentRanking) {
		this.currentRanking = currentRanking;
	}
	public int getBestRanking() {
		return bestRanking;
	}
	public String getPreferredCourt() {
		return preferredCourt;
	}
	public int getLastFought() {
		return lastFought;
	}
	@Override
	public String toString() {
		return "PlayerCareer [matchesPlayed=" + matchesPlayed + ", matchesWon=" + matchesWon + ", currentRanking="
				+ currentRanking + ", bestRanking=" + bestRanking + ", preferredCourt=" + preferredCourt
				+ ", lastFought=" + lastFought + "]";
	}
	public void setBestRanking(int bestRanking) {
		this.bestRanking = bestRanking;
	}
	public void setLastFought(int lastFought) {
		this.lastFought = lastFought;
	}
}
