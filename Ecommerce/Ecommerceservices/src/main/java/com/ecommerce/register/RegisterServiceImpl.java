package com.ecommerce.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.login.Login;
import com.ecommerce.login.LoginRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public String RegisterUser(Login login) {
		
		boolean result=loginRepository.register(login);
		if(result) {
			return "Registered Succesfully";
		}else {
			return "Something went wrong!";
		}
		
	}

}
