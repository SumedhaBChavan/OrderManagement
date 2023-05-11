package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;


@RestController 
public class CustomerController {
	
	@Autowired 
	CustomerService  customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.saveCustomer(customer);
		
	}
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id") int id)
	{
		return customerService.getCustomer(id);
	}
	
	@GetMapping("/search/{email}")
	public List<Customer> searchByEmail(@PathVariable String email)
	{
		System.out.println(email);
		System.out.println(customerService.find(email));
		return customerService.find(email);
		
	}

	
	
	

}
