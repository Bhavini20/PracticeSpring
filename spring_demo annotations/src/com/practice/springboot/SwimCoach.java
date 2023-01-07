package com.practice.springboot;


public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	//constructor injection
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000m!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
