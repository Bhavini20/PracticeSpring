package com.practice.springboot;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for sending in email and team name
	
	private String emailAddress;
	private String team;
	
	//set the setter and getter methods for injections
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method: emailaddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter method: setTeam ");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

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
