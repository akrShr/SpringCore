package com.coreJavanSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class SpringApp {
	
	private AbstractXmlApplicationContext context;
	
	private SpringApp(){
		//load Spring Configuration  file
		this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	private void loadBeansAndDoTasks(String name){
		//get the bean
		Coach coach = this.context.getBean(name,Coach.class);			
	   	
		//call method on the beans
		coach.getDietInfo(); 
		System.out.println(coach.getDailyWorkout());
		coach.getCoachDetails();
		
	}
	
	public static void main(String[] args) {
		
		SpringApp app = new SpringApp();
		
		List<String> beanNames = new ArrayList<String>();
		beanNames.add("cricket");
		beanNames.add("baseball");
		beanNames.add("cricket");
		beanNames.add("cricket");
		beanNames.add("baseball");
		beanNames.add("baseball");
		beanNames.add("track");
		
		beanNames.forEach(app::loadBeansAndDoTasks);
		
		app.releaseResources();
		
	}

	private void releaseResources(){
		//close the context
		this.context.close();
	}
}
