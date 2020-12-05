package com.koolcoding.orderingsystem.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koolcoding.orderingsystem.food.model.Orders;

public interface OrderDaoInterface extends JpaRepository<Orders, Long>{

}
