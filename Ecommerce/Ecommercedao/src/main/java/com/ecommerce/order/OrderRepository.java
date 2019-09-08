package com.ecommerce.order;

public interface OrderRepository {
	
	public boolean placeOrder(Order order);
	
	public boolean cancelOrder(String orderId);


}
