package com.coreJavanSpringwithAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennis")
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Value("30")
	private int minT;	
	
	@Override
	public String getDailyWorkout() {			
		String msg = "Practise your backhand volley "+ this.minT+" minutes --Tennis";
		this.minT+=5;
		return msg;
	}

}
