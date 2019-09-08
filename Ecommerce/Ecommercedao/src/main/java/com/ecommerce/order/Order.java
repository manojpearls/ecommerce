package com.ecommerce.order;

import java.time.LocalDateTime;

public class Order {
	
	private String orderId;
	private String prdtId;
	private String prdtName;
	private int prdtRate;
	private LocalDateTime orderDate;
	private String orderPlaced;
	private String userId	;
	
	public Order()
	{
		
	}
	
	public Order(String orderId ,String prdtId ,String prdtName ,int prdtRate ,LocalDateTime orderDate ,String orderPlaced ,String userId)
	{
		super();
		this.orderId=orderId  ; 
		this.prdtId= prdtId ; 
		this.prdtName= prdtName ; 
		this.prdtRate= prdtRate ; 
		this.orderDate= orderDate ; 
		this.orderPlaced= orderPlaced ; 
		this.userId    = userId ; 

		
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPrdtId() {
		return prdtId;
	}
	public void setPrdtId(String prdtId) {
		this.prdtId = prdtId;
	}
	public String getPrdtName() {
		return prdtName;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}
	public int getPrdtRate() {
		return prdtRate;
	}
	public void setPrdtRate(int prdtRate) {
		this.prdtRate = prdtRate;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderPlaced() {
		return orderPlaced;
	}
	public void setOrderPlaced(String orderPlaced) {
		this.orderPlaced = orderPlaced;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
}
