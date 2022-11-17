package com.practice.springboot;

public class BasketballCoach implements Coach{
    
	@Override
	public String getDailyWorkout() {
		return "Spending 30 mins on batting practice";
	}
}
