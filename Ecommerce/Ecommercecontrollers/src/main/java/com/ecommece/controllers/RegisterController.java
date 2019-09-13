package com.ecommece.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.login.Login;
import com.ecommerce.register.RegisterService;

@RestController
@RequestMapping("/webservice")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping(path= "/addUser", consumes = "application/json", produces = "application/json")
	public String addUser(@RequestBody Login login){
		String result=registerService.RegisterUser(login);
		return result;
	}
}
