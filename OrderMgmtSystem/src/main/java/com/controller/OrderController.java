package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.NewOrder;
import com.service.OrderService;



@RestController 
public class OrderController {
	
	@Autowired
	OrderService  orderService;
	
	@PostMapping("/addOrders")
	public NewOrder addOrder(@RequestBody NewOrder order)
	{
		return orderService.saveOrder(order);
	}
	
	@GetMapping("/total")
	public List<Integer[]> findTotal()
	{
		return orderService.findTotal();
	}
	

}
