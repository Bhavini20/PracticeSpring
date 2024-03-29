package com.practice.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.springdemo.dao.CustomerDAO;
import com.practice.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	//inject customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		//simply delegate the calls to DAO.
		//arch 
		//controller -> service <- DAO <- Database
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	//service basically deligates the call to DAO
	public Customer getCustomer(int theId) {
		 return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
		
	}

}
