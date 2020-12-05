package com.koolcoding.orderingsystem.food.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.koolcoding.orderingsystem.food.model.FoodItems;

public interface FoodItemsInterface extends JpaRepository<FoodItems, Long>{
	
	@Query("SELECT fd FROM FoodItems fd WHERE fd.name like %?1")
	List<FoodItems> findFoodItems(String name);
     

}
