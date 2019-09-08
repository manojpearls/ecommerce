package com.ecommerce.order;

public interface OrderSql {
	
	public final static String  PLACE_ORDER="INSERT INTO ORDER_DETAILS (order_id,prdt_id,prdt_name,prdt_rate,order_date,order_placed,user_id )"+
			   " VALUES (:order_id,:prdt_id,:prdt_name,:prdt_rate,:order_date,:order_placed,:user_id) ";
	
	public final static String  CANCEL_ORDER="DELETE  FROM ORDER_DETAILS "+
			        "WHERE  order_id=:order_id ";
	

}
