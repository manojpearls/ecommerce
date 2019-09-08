package com.ecommerce;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ecommerce.configuration.ApplicationConfiguration;
import com.ecommerce.login.Login;
import com.ecommerce.login.LoginRepositoryImpl;
import com.ecommerce.order.OrderRepositoryImpl;
import com.ecommerce.product.ProductRepositoryImpl;



public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		LoginRepositoryImpl loginRepository=(LoginRepositoryImpl) context.getBean("loginRepositoryImpl");
		
		OrderRepositoryImpl orderRepository=(OrderRepositoryImpl) context.getBean("orderRepositoryImpl");
		
		ProductRepositoryImpl productRepository=(ProductRepositoryImpl) context.getBean("productRepositoryImpl");
		
		
		 Login login=new Login();
		 /*LocalDateTime now = LocalDateTime.now();
		 DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		String formatDateTime = now.format(format);
		 System.out.println("datetime1"+formatDateTime);
		 Object localDateTime; */
		 LocalDateTime ldt = LocalDateTime.now();
		 System.out.println("datetime1"+ldt);




		  //insert module
		login.setUserId("A1");
		login.setUserName("Manoj");
		login.setUserPwd("123");
		login.setUserAddress("Address");
		login.setMobileNo("900001234");
		login.setOldPwd("old");
		login.setUserEmailid("abc@gmail.com");
		login.setRegisterDate(LocalDateTime.of(2019, 9, 6, 12, 30));
		//login.setLastUpdate(LocalDateTime.of(2019, 9, 6, 12, 30));
		
	
		boolean res=loginRepository.register(login);
		System.out.println("Record : " + res);
		 

		 //validate 
		 
	     //login.setUserId("Manoj");
		// login.setUserPwd("123");
		// boolean res=loginRepository.validate(UserId, password);
		// System.out.println("validation"+res);
		 

		 
		 // delete 
		// login.setUserId("A1");
		 
		/* boolean res=loginRepository.delete("A1");
		System.out.println("validation"+res);*/
		 
		 
		 //boolean res=loginRepository.validate("A1","12");
		 //System.out.println("validation   "+res);
		 
		/*  Order order=new Order();
		 
		 order.setOrderId("Ord2");
		 order.setPrdtId("Prd2");
		 order.setPrdtName("Pen");
		 order.setPrdtRate(150);
		 order.setOrderDate(null);
		 order.setOrderPlaced("yes");
		 order.setUserId("A1");
		 */
		 
		 //boolean res=orderRepository.placeOrder(order);
			//System.out.println("Placed  -->>>>" + res);
			
			
			//boolean res=orderRepository.cancelOrder("Ord1");
			//System.out.println("Cancelled "+res);
		 
			
			// product
			
			/*Product product=new Product();
			product.setPrdtId("Prd1");
			product.setPrdtName("Book");
			product.setPrdtImage("ZZZZZZZZZ");
			product.setBrandName("test");
			product.setPrdtColor("Yellow");
			product.setPrdtRate(120);
			product.setPrdtInDate(null);
			product.setPrdtPurchased("yes");
			
			boolean res=productRepository.register(product);
			System.out.println("registered  -->>>>" + res);
			
			
			//boolean res=productRepository.delete("Prd1");
			//System.out.println("Deleted "+res);
		
			
		*/
	}

}
