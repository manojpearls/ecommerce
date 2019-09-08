package com.ecommerce.product;

public interface ProductRepository {
	
	public boolean register(Product product);
	
	public boolean delete(String prdtId);

}
