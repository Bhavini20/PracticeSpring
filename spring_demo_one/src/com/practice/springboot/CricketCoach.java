package com.practice.springboot;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a new args constructor
	public CricketCoach() {	
	}
	
	//create a setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting and fast bowling for 15 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
