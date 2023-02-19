package com.practice.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.springdemo.dao.CustomerDAO;
import com.practice.springdemo.entity.Customer;
import com.practice.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the DAO into this controller
	//@Autowired
	//public CustomerDAO customerDAO;
	//now instead of using the DAO directly we make use of another layer in between called the service layer
	//now inject customer service
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get customers from DAO
		List<Customer> theCustomers = customerService.getCustomers();
		
		//ADD the customers to spring model (name,value)
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

}
