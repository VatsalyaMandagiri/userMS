package com.FA.userMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.FA.userMS.entity.Buyer;

public interface BuyerRepo extends CrudRepository<Buyer, String> {
	
	public Buyer findByPhoneNumber(String phoneNumber);
	
	public Buyer findByEmail(String email);
	
	public Buyer findByBuyerId(String id);

}
