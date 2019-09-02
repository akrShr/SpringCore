package com.coreJavanSpring;

import java.util.List;
import java.util.Scanner;

public class CarbohydrateDiet implements DietaryService {

	private int gramsValue;
	private List<String> dietContent;
	
	public CarbohydrateDiet(int gramsValue){
		this.gramsValue = gramsValue;
	}
	
	public void setDietContent(List<String> dietContent) {		
		this.dietContent = dietContent;
	}
	
	@Override
	public String getDietValue() {
		
		return "Today you need "+gramsValue+" grams of carbs.";
	}

	@Override
	public void displayDietContent() {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object	
		System.out.println("Want coach designed diet ? Enter (yes/no)");
	    String choice = scanner.nextLine();  // Read user input
	    
	    if(choice.equalsIgnoreCase("yes")){
	    	System.out.println("Please eat these items :");
			this.dietContent.forEach((i)->System.out.println(i));
	    }
	    scanner.close();
	}
}