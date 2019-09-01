package com.ecommerce.login;

public interface LoginRepository {

	public boolean register(Login login);
	
	public boolean validate(Login login);
}
