package com.coreJavanSpring;

public class CricketCoach implements Coach {
	
	private int minT;
	
	public CricketCoach(int minT){
		this.minT=minT;
	}

	@Override
	public String getDailyWorkout() {		
		String msg = "Practise bowling for "+ this.minT+" minutes --Cricket";
		this.minT+=5;
		return msg;
	}

}
