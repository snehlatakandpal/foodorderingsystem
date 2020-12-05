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
@Table(name="OrderDetails")
public class OrderDetails implements Serializable{

	private static final long serialVersionUID = 8065171659750897818L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderDetailId;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "order_id", nullable = false)
	private Orders orders;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "item_id", nullable = false)
	 private FoodItems items;
	
	public OrderDetails(long orderDetailId, long orderid, long item, int quantity) {
		super();
		this.orderDetailId = orderDetailId;		
		this.quantity = quantity;
	}

	public long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int quantity;

}
