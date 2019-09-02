package com.coreJavanSpringwithAnnotations;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarbohydrateDiet implements DietaryService {

	@Value("100")
	private int gramsValue;
	private List<String> dietContent;

	
	@Override
	public String getDietValue() {
		return "Today you need "+gramsValue+" grams of proteins.";
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
	
	@Autowired
	@Qualifier("carbs")
	public void setDietContent(List<String> dietContent) {
		this.dietContent = dietContent;
	}


}
