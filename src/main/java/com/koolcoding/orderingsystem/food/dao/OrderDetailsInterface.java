package com.koolcoding.orderingsystem.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koolcoding.orderingsystem.food.model.OrderDetails;

public interface OrderDetailsInterface extends JpaRepository<OrderDetails, Long>{

}
