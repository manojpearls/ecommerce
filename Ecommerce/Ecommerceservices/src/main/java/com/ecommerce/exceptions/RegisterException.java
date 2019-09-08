package com.ecommerce.exceptions;

public class RegisterException extends Exception {

	public RegisterException(String message){
		try {
			throw new Exception(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
