package com.koolcoding.orderingsystem.food.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor implements Serializable{
	
	private static final long serialVersionUID = 6274957849908364254L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long vendorid;

	 @OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	 private List<FoodItems> foodItems;
	
	private String vname;
	
	private String vaddress;
	
	private String vphone;
	
	private String zipcode;
	
	private String status;
	
	public Vendor(long vendorid, List<FoodItems> foodItems, String vname, String vaddress, String vphone, String zipcode,
			String status) {		
		this.vendorid = vendorid;
		this.foodItems = foodItems;
		this.vname = vname;
		this.vaddress = vaddress;
		this.vphone = vphone;
		this.zipcode = zipcode;
		this.status = status;
	}

	public Vendor() {}

	public long getVendorid() {
		return vendorid;
	}

	public void setVendorid(long vendorid) {
		this.vendorid = vendorid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVaddress() {
		return vaddress;
	}

	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}

	public String getVphone() {
		return vphone;
	}

	public void setVphone(String vphone) {
		this.vphone = vphone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<FoodItems> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}


}
