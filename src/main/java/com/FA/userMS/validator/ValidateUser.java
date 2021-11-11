package com.FA.userMS.validator;

import com.FA.userMS.dto.BuyerDTO;
import com.FA.userMS.dto.SellerDTO;
import com.FA.userMS.exception.UserException;

public class ValidateUser {
	
	public static void validateBuyer(BuyerDTO buyer) throws UserException {
		
		if(!validateName(buyer.getName()))
			throw new UserException("Validator.ENTER_VALID_NAME");
		
		if(!validateEmail(buyer.getEmail()))
			throw new UserException("Validator.ENTER_VALID_EMAIL");
		
		if(!validateContactNumber(buyer.getPhoneNumber()))
			throw new UserException("Validator.ENTER_VALID_NUMBER");
		
			
		if(!validatePassword(buyer.getPassword()))
			throw new UserException("Validator.Enter_VALID_PASSWORD");
		
	}
	
	public static void validateSeller(SellerDTO buyer) throws UserException {
		
		if(!validateName(buyer.getName()))
			throw new UserException("Validator.ENTER_VALID_NAME");
		
		if(!validateEmail(buyer.getEmail()))
			throw new UserException("Validator.ENTER_VALID_EMAIL");
		
		if(!validateContactNumber(buyer.getPhoneNumber()))
			throw new UserException("Validator.ENTER_VALID_NUMBER");
		
			
		if(!validatePassword(buyer.getPassword()))
			throw new UserException("Validator.Enter_VALID_PASSWORD");
		
	}
	
	
	public static boolean validateName(String name)
	{
		
		String regex = "[A-Za-z]+([ ][A-Za-z]+)*";
		
		if(name.matches(regex))
			return true;
		
		return false;
		
	}
	
	public static boolean validateEmail(String email)
	{
		String regex = "[A-za-z]+@[A-za-z]+[\\.]com";
		
		if(email.matches(regex))
			return true;
		
		return false;
	}
	
	public static boolean validateContactNumber(String contactNumber)
	{
		
		String regex = "[6,7,8,9][0-9]{9}";
		
		if(contactNumber.matches(regex))
			return true;
		
		return false;
	}
	
	public static boolean validatePassword(String password)
	{
		String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{7,20}$";
		
		if(password.matches(regex))
			return true;
		
		return false;
	}	

}
