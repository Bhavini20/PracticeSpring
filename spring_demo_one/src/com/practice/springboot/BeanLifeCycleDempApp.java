package com.practice.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDempApp {

	public static void main(String[] args) {
		
		//load the configuration file to the program
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext2.xml"); 

		//retrieve the bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
