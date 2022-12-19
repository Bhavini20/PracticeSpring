package com.practice.springboot;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
   
public TrackCoach() {
	
	}


	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
	 fortuneService = theFortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spending 40 mins on track";
	}

	@Override
public String getDailyFortune() {
		//use my fortune service for fortune 
		return "Yayyy" +fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartStuff() {
		System.out.println("TrackCoach: inside method startupstuff");
	}
	
	//add a destroy method
    public void doMyCleanupStuff() {
    	System.out.println("Trackcoach: inside method cleanupstuff");
    }
}
