package com.practice.springboot;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of string
	private String[] data = {
			"happy day!",
			"Take care!",
			"Please be happy",
			"Gotta be focused",
			"Yeah, you have a very good day ahead"
	};
	
	//create a random number generator 
	 private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		//pick a random string
		int i = myRandom.nextInt(data.length);
		return data[i];
	}

}
