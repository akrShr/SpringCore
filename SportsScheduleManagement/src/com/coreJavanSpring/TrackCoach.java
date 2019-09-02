package com.coreJavanSpring;

public class TrackCoach implements Coach {	

	private DietaryService diet;
	private String emailAdr;
	private String teamName;
	
	
	public TrackCoach() {
			
		}
		
	public TrackCoach(DietaryService diet){
		this.diet=diet;
	}
	
	public void setEmailAdr(String emailAdr) {
		this.emailAdr = emailAdr;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	@Override
	public void getDietInfo(){
		System.out.println(diet.getDietValue());
		diet.displayDietContent();
	}
	
	@SuppressWarnings("unused")
	private void welcomePlayers(){
		System.out.println("Welcome!!\n");
	}
	
	@SuppressWarnings("unused")
	private void remindPlayers(){
		System.out.println("Do not forget to take your belongings -- wallet,mobile,keys");
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
