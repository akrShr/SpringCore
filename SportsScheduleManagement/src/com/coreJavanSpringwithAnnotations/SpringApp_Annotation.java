package com.coreJavanSpringwithAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp_Annotation {
	
	private AbstractXmlApplicationContext context;
	
	
	private SpringApp_Annotation() {		
		//load Spring Configuration  file
		this.context = new ClassPathXmlApplicationContext("annotatedApplicationContext.xml");	
	}

	public void loadBeansAndDoTasks(String name){	
	
		Coach coach = this.context.getBean(name,Coach.class);		
	   	
		coach.getDietInfo();	
		System.out.println(coach.getDailyWorkout());	
		coach.getCoachDetails();
		}
	
	public static void main(String[] args) {
		
		SpringApp_Annotation app = new SpringApp_Annotation();
		
		List<String> beanNames = new ArrayList<String>();
		
		beanNames.add("tennis");
		beanNames.add("basket");
		beanNames.add("basket");
		beanNames.add("tennis");
		beanNames.add("trackCoach");		
		
		beanNames.forEach(app::loadBeansAndDoTasks);
		
		app.releaseResources();
	
	}
	
	private void releaseResources(){
		//close the context
		this.context.close();
	}
		
}
