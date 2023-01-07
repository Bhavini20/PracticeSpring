package com.practice.springboot;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Its ok to be a little sad!";
	}

}
