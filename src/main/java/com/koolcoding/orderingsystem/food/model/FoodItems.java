package com.koolcoding.orderingsystem.food.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FoodItems")
public class FoodItems implements Serializable{
	
	private static final long serialVersionUID = -7548253149329761040L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long itemid;
	
	private String name;
	
	private String description;	
	
	private double price;
	
	private int quantity;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "vendor_id", nullable = false)
	private Vendor vendor;
	
	

	 public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@OneToMany(mappedBy = "items", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	 private Set<OrderDetails> orderDetail;
	 
	public long getItemid() {
		return itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public FoodItems(long itemid, String name, String description, double price, int quantity, Vendor vendor) {		
		this.itemid = itemid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.vendor = vendor;
	}

	public FoodItems() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
