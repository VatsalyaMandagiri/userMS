package com.FA.userMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.FA.userMS.entity.Seller;

public interface SellerRepo extends CrudRepository<Seller, String> {
	
	public Seller findByPhoneNumber(String phoneNumber);
	
	public Seller findByEmail(String email);
	
	public Seller findBySellerId(String id);

}