package com.koolcoding.orderingsystem.food.response;

import java.util.List;

public class SearchItemDetails {
	
private String vendorname;
	
	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	private List<ItemList> itemList;

	public List<ItemList> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemList> itemList) {
		this.itemList = itemList;
	}


}
