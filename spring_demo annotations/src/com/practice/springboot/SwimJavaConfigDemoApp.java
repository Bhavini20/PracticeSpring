package com.practice.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		
		//get the bean using bean id
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//get the bean using default bean id tennisCoach same name as class, first character lower case
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		//call method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close
		context.close();
	}

}
