package com.coreJavanSpring;

public class BaseballCoach implements Coach {

	private int minT;
	
	public BaseballCoach(int minT){
		this.minT=minT;
	}
	
	@Override
	public String getDailyWorkout() {		
		String msg = "Spend "+ this.minT+" minutes practising batting--Baseball";
		this.minT+=10;
		return msg;
	}

}
