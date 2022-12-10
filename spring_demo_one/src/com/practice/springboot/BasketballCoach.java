package com.practice.springboot;

public class BasketballCoach implements Coach{
    
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BasketballCoach(FortuneService theFortuneService) {
	 fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spending 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service for fortune 
		
		return fortuneService.getFortune();
	}
}
