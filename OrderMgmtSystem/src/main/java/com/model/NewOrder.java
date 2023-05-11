package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity  
@Table (name="orders")
public class NewOrder {
	@Id 
	private  int id;
	
	@OneToMany(fetch=FetchType.EAGER, cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval=true)
	
	List<Item> items;

	@ManyToOne 
	private Customer customer;

	public NewOrder() {
		super();
	}

	public NewOrder(int id, List<Item> items, Customer customer) {
		super();
		this.id = id;
		this.items = items;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
}
