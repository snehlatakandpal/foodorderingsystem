package com.koolcoding.orderingsystem.food.response;

public class ItemList {
	
	private String itemname;
	
	private double price;

	private int availableqnty;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableqnty() {
		return availableqnty;
	}

	public void setAvailableqnty(int availableqnty) {
		this.availableqnty = availableqnty;
	}
	
	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


}
