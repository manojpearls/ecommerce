package com.ecommerce;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ecommerce.configuration.ApplicationConfiguration;
import com.ecommerce.login.Login;
import com.ecommerce.login.LoginRepositoryImpl;


public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		LoginRepositoryImpl loginRepository=(LoginRepositoryImpl) context.getBean("loginRepositoryImpl");
		
		
		Login login=new Login();
		login.setUserId("A1");
		login.setUserName("Manoj");
		login.setUserPwd("123");
		login.setUserAddress("Address");
		login.setMobileNo("900001234");
		login.setOldPwd("old");
		login.setUserEmailid("abc@gmail.com");
		login.setRegisterDate(LocalDateTime.of(2019, 9, 1, 12, 30));
		login.setLastUpdate(LocalDateTime.of(2019, 9, 1, 12, 30));
		
		boolean res=loginRepository.register(login);
		System.out.println("Record : " + res);
		
	}

}
