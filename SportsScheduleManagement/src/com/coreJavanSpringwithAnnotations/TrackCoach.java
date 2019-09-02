package com.coreJavanSpringwithAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class TrackCoach implements Coach {
	
	@Value("${coach.email}")
	private String emailAdr;
	@Value("${coach.team}")
	private String teamName;	
	private DietaryService diet;
	
	public TrackCoach() {
		
	}
	
	@Autowired	
	public TrackCoach(@Qualifier("carbohydrateDiet")DietaryService diet) {
		this.diet = diet;
	}
	
	
	@PostConstruct
	private void welcomePlayers(){
		System.out.println("Welcome!!\n");
	}
	
	@PreDestroy
	private void remindPlayers(){
		System.out.println("Do not forget to take your belongings -- wallet,mobile,keys");
	}


	@Override
	public void getDietInfo(){
		System.out.println(diet.getDietValue());
		diet.displayDietContent();
		
	}
	

	@Override
	public String getDailyWorkout() {
		
		return "Wrap up via ---> Swimming-----Cycling-----Running\n";
	}     

	@Override
	public void getCoachDetails(){
		System.out.println("If you are part of the team "+ this.teamName);
		System.out.println("You can contact the coach via email -->"+this.emailAdr);
		
	}
}
