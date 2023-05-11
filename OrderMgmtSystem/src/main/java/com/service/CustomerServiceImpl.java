package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.exception.NoSuchCustomerExitsException;
import com.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepo;
	
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	
	@Override
	public List<Customer> find(String email) {
		
		return customerRepo.find(email);
	}

	@Override
	public Customer getCustomer(int id)
	{
		return customerRepo.findById(id).orElseThrow(
				()->
				new NoSuchCustomerExitsException("No Sutch customer woth id= "+id)
				);
	
	}

}
