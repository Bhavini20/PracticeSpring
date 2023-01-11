package com.practice.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//otherwise the error of ambiguous mapping will come because otherwise homeWorldController
//also has this showForm mapping 
@RequestMapping("/hello")
public class SillyController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "main-menu";
	}
}
