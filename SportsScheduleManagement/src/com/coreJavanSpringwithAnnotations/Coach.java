package com.coreJavanSpringwithAnnotations;

public interface Coach {
	
	default void getDietInfo(){
		//No plan finalized
		}
	default void getCoachDetails(){
		//No details specified uptil now!
	}
	
	String getDailyWorkout();

}
