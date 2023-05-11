package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);
	
	List<Customer> find(String email);

	Customer getCustomer(int id);

}
