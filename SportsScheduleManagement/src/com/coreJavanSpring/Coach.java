package com.coreJavanSpring;

public interface Coach {
	
	String getDailyWorkout();
	
	default void getDietInfo(){
		//No plan finalized
		}
	
	default void getCoachDetails(){
		//No details specified uptil now!
	}

}
