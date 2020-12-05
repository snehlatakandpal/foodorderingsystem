package com.koolcoding.orderingsystem.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koolcoding.orderingsystem.food.model.Vendor;

public interface VendorDaoInterface extends JpaRepository<Vendor, Long> {
	
	Vendor findByVname(String vname);

}
