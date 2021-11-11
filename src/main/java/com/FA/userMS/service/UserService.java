package com.FA.userMS.service;

import java.util.List;

import com.FA.userMS.dto.BuyerDTO;
import com.FA.userMS.dto.CartDTO;
import com.FA.userMS.dto.SellerDTO;
import com.FA.userMS.exception.UserException;

public interface UserService {

	public String buyerRegistration(BuyerDTO buyerDTO) throws UserException;
	
	public String sellerRegistration(SellerDTO sellerDTO) throws UserException;
	
	public String buyerLogin(String email, String password) throws UserException;
	
	public String sellerLogin(String email, String password) throws UserException;
	
	public String deleteBuyer(String id);
	
	public String deleteSeller(String id);
	
	public String wishlistService(String prodId,String buyerId);
	
	public String cartService(String prodId, String buyerId, Integer quantity);
	
	public List<CartDTO> getCartProducts(String id) throws UserException;
	
	public String removeFromCart(String buyerId, String prodId) throws UserException;
	
	public String updateRewardPoint(String buyerId, Integer rewPoints) throws UserException;
	
}

