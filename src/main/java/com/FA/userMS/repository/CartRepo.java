package com.FA.userMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.FA.userMS.entity.Cart;
import com.FA.userMS.utility.PrimaryKey;

public interface CartRepo extends CrudRepository<Cart, PrimaryKey> {
	
	
	public List<Cart> findByCustomPKBuyerId(String id); 
	
	public void deleteByCustomPKBuyerIdAndCustomPKProdId(String buyId,String prodId);
	
	public Cart findByCustomPKBuyerIdAndCustomPKProdId(String buyId,String ProdId);

}
