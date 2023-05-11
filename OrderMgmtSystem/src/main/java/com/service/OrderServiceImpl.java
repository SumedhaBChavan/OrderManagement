package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderRepository;
import com.model.NewOrder;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepo;
	
	@Override
	public NewOrder saveOrder(NewOrder order)
	{
		
		return orderRepo.save(order);
	}

	@Override
	public List<Integer[]> findTotal() 
	{
		
		return orderRepo.findTotal();
	}

}
