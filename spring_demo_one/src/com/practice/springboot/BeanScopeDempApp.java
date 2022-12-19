package com.practice.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDempApp {

	public static void main(String[] args) {
		
		//load the configuration file to the program
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext2.xml"); 

		//retrieve the bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		//print Results
		System.out.println("pointing to same bean/object "+ result);
		System.out.println("Memory location thCoach "+ theCoach);
		System.out.println("Memory location alphaCoach "+ alphaCoach);
		
		context.close();
	}

}
