package com.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
	@Query("select c from Customer c where c.email=:e")
	public List <Customer> find(@Param("e")String email);
	

}
