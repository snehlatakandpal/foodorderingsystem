package com.koolcoding.orderingsystem.food.model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="Orders")
public class Orders implements Serializable{

	private static final long serialVersionUID = 927418981311115421L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderid;	
	
	private Date date;
	
	private double amount;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "userid", nullable = false)
	 private Users user;
	 
	 @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	 private Set<OrderDetails> orderDetails;	 
	

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Orders(long orderid, Date date, double amount, Users user) {
		this.orderid = orderid;
		this.date = date;
		this.amount = amount;
		this.user = user;
	}

	public Orders() {}
	
	
}
