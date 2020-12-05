package com.koolcoding.orderingsystem.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koolcoding.orderingsystem.food.response.SearchResult;
import com.koolcoding.orderingsystem.food.service.FoodItemService;

@RestController
public class FoodOrderingController {

	@Autowired
	FoodItemService foodService;

	@GetMapping(value = "/searchFoodItems")
	public SearchResult searchFoodItems(@RequestParam(required = false) String itemname, @RequestParam(required = false) String vendorname) {
		SearchResult foodItem=foodService.getSearchResult(itemname,vendorname);				
		return foodItem;
	}
	

	@GetMapping(value = "/orderFoodItems")
	public String orderFoodItems() {
		return null;
	}

	@GetMapping(value = "/viewOrderHistory")
	public String viewOrderHistory() {
		return null;
	}
}
