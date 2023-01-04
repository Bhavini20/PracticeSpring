package com.practice.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//get the bean
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//get the bean using default bean id tennisCoach same name as class, first character lower case
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close
		context.close();
	}

}
