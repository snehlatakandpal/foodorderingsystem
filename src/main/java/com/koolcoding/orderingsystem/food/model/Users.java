package com.koolcoding.orderingsystem.food.model;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users implements Serializable{

	private static final long serialVersionUID = 5223466285878175615L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userid;	
	
	
	 @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	 private Set<Orders> order;
	 
	private String name;
	
	private String email;
	
	private String phone;
	
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Users(long userid, Set<Orders> order, String name, String email, String phone, String address) {
		this.userid = userid;
		this.order = order;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public Users() {}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	
}
