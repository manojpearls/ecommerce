package com.ecommerce.login;

public interface LoginRepository {

	public boolean register(Login login);
	
	public boolean validate(String userId,String password);
	
	public boolean delete(String userId);
}
