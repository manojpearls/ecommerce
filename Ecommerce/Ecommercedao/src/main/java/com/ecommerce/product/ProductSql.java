package com.ecommerce.product;

public interface ProductSql {
	
	public final static String  REGISTER_PRODUCT="INSERT INTO PRODUCT "+
			"(prdt_id,prdt_name,prdt_image,brand_name,prdt_color,prdt_rate,prdt_in_date,prdt_purchased )" + 
			"VALUES (:prdt_id,:prdt_name,:prdt_image,:brand_name,:prdt_color,:prdt_rate,:prdt_in_date,:prdt_purchased )"; 
			
	
	public final static String  DELETE_PRODUCT="DELETE  FROM PRODUCT "+
	        "WHERE  prdt_id=:prdt_id ";

}
