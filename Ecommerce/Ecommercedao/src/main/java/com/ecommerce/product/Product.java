package com.ecommerce.product;

import java.time.LocalDateTime;

public class Product {
	
	private String prdtId;
	private String prdtName;
	private String prdtImage;
	private String brandName;
	private String prdtColor;
	private int prdtRate;
	private LocalDateTime prdtInDate;
	private String prdtPurchased;
	
	public Product()
	{
		
	}
	public Product(String prdtId ,String prdtName ,String prdtImage ,String brandName ,String prdtColor ,int prdtRate ,LocalDateTime prdtInDate ,String prdtPurchased)
	{
		super();	
		this.prdtId =prdtId ;
		this.prdtName =prdtName ;
		this.prdtImage =prdtImage ;
		this.brandName =brandName ;
		this.prdtColor =prdtColor ;
		this.prdtRate =prdtRate ;
		this.prdtInDate =prdtInDate ;
		this.prdtPurchased =prdtPurchased ;
		
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
	public String getPrdtImage() {
		return prdtImage;
	}
	public void setPrdtImage(String prdtImage) {
		this.prdtImage = prdtImage;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getPrdtColor() {
		return prdtColor;
	}
	public void setPrdtColor(String prdtColor) {
		this.prdtColor = prdtColor;
	}
	public int getPrdtRate() {
		return prdtRate;
	}
	public void setPrdtRate(int prdtRate) {
		this.prdtRate = prdtRate;
	}
	public LocalDateTime getPrdtInDate() {
		return prdtInDate;
	}
	public void setPrdtInDate(LocalDateTime prdtInDate) {
		this.prdtInDate = prdtInDate;
	}
	public String getPrdtPurchased() {
		return prdtPurchased;
	}
	public void setPrdtPurchased(String prdtPurchased) {
		this.prdtPurchased = prdtPurchased;
	}
   
	

}
