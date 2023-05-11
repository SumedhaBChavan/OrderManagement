package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Item {
	
	@Id 
	private int itemId;
	private String description;
	private int price;
	public Item() {
		super();
	}
	public Item(int itemId, String description, int price) {
		super();
		this.itemId = itemId;
		this.description = description;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
