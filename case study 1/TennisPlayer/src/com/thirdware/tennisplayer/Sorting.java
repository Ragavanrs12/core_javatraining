package com.thirdware.tennisplayer;
import java.util.Comparator;
import com.thirdware.tennisplayer.TennisPlayer;
public class Sorting {

}
class Playerrank implements Comparator<TennisPlayer>{
	@Override
	public int compare(TennisPlayer o1, TennisPlayer o2) {
		// TODO Auto-generated method stub
		if(o1.careerDetail.getCurrentRanking()==o2.careerDetail.getCurrentRanking())
			return 0;
		else if(o1.careerDetail.getCurrentRanking()>=o2.careerDetail.getCurrentRanking())
			return 1;
		else
			return -1;
	}
}
class PlayerNaming implements Comparator<TennisPlayer>{
	@Override
	public int compare(TennisPlayer o1, TennisPlayer o2) {
		// TODO Auto-generated method stub
		return o1.getPlayerName().compareTo(o2.getPlayerName());
	}
}