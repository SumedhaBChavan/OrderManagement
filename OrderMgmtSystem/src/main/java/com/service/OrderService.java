package com.service;

import java.util.List;

import com.model.NewOrder;

public interface OrderService {
	
	NewOrder saveOrder(NewOrder order);
	
	public List<Integer[]>findTotal();
	

}
