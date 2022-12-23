package com.practice.springboot;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
//default bean id
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

}
