package com.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.NewOrder;



public interface OrderRepository extends JpaRepository<NewOrder, Integer> {

	List<Integer[]> findTotal();

	/*
	  @Query("select sum(price),customer_id from orders, orders_items, item where id=order_id and items_itemid=itemid group by customer_id ")
	  public List<Integer[]> findTotal();
	*/

}
