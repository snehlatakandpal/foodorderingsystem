package com.koolcoding.orderingsystem.food.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koolcoding.orderingsystem.food.dao.FoodItemsInterface;
import com.koolcoding.orderingsystem.food.dao.OrderDaoInterface;
import com.koolcoding.orderingsystem.food.dao.OrderDetailsInterface;
import com.koolcoding.orderingsystem.food.dao.UserDaoInterface;
import com.koolcoding.orderingsystem.food.dao.VendorDaoInterface;
import com.koolcoding.orderingsystem.food.model.FoodItems;
import com.koolcoding.orderingsystem.food.model.Vendor;
import com.koolcoding.orderingsystem.food.response.ItemList;
import com.koolcoding.orderingsystem.food.response.SearchItemDetails;
import com.koolcoding.orderingsystem.food.response.SearchResult;

@Service
public class FoodItemService {

	@Autowired
	OrderDaoInterface orderObj;

	@Autowired
	UserDaoInterface userObj;

	@Autowired
	OrderDetailsInterface orderDetailObj;

	@Autowired
	FoodItemsInterface foodItemsObj;

	@Autowired
	VendorDaoInterface vendorObj;

	/*
	 * code to search food items by item name or vendor name
	 */
	public SearchResult getSearchResult(String itemname, String vendorname) {
		SearchResult searchResult = new SearchResult();
	
		if (itemname != null) {

			List<FoodItems> items = foodItemsObj.findFoodItems(itemname);

			List<SearchItemDetails> srchitemdetList = getdata(items);

			searchResult.setSearchResult(srchitemdetList);
		} else if (vendorname != null) {

			Vendor vendorList = vendorObj.findByVname(vendorname);

			List<SearchItemDetails> srchitemdetList = getdata(vendorList.getFoodItems());
			
			searchResult.setSearchResult(srchitemdetList);

		}
		return searchResult;

	}
	
	/*
	 *setting search food item based on item name/vendor name
	 */
	private List<SearchItemDetails> getdata(List<FoodItems> fooditem)
	{
		SearchItemDetails searchItemdetail = new SearchItemDetails();
		List<SearchItemDetails> srchitemdetList = new ArrayList<SearchItemDetails>();
		ItemList foodItem = new ItemList();
		String vendorName = null;
		List<ItemList> foodItemList = new ArrayList<ItemList>();
		for (FoodItems item : fooditem) {
			foodItem = new ItemList();
			foodItem.setItemname(item.getName());
			foodItem.setPrice(item.getPrice());
			foodItem.setAvailableqnty(item.getQuantity());
			foodItemList.add(foodItem);
			searchItemdetail.setItemList(foodItemList);
			vendorName=item.getVendor().getVname();
			
		}
		searchItemdetail.setVendorname(vendorName);
		srchitemdetList.add(searchItemdetail);
		
		return srchitemdetList;
		
	}
}
