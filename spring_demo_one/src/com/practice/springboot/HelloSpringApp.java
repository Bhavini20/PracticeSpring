package com.practice.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close the context
		context.close();


	}

}
