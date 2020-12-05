package com.koolcoding.orderingsystem.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koolcoding.orderingsystem.food.model.Users;

public interface UserDaoInterface extends JpaRepository<Users, Long>{

}
