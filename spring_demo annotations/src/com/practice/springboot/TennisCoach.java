package com.practice.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
//default bean id
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">>>inside default constructor");
	}
	
	//setter injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">>>inside setter method");
		fortuneService = theFortuneService;
	}
	
	/*
	 
	 //constructor injection
	 @Autowired
	public TennisCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	} */
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		//object calling method defined in HappyFortune
		return fortuneService.getFortune();
	}

}
