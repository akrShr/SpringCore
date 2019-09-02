package com.coreJavanSpringwithAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("basket")
@Scope("singleton")
public class BasketBall implements Coach {

	@Value("10")
	private int minT;
	
	
	@Override
	public String getDailyWorkout() {			
		String msg = "Practise your dribbling ball for "+ this.minT+" minutes --BasketBall";
		this.minT+=15;
		return msg;
	}


}
