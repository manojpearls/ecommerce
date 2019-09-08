package com.ecommerce.order;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public boolean placeOrder(Order order) {
		// TODO Auto-generated metho	d stub
		Map<String,Object> map=new HashMap<>();
		map.put("order_id", order.getOrderId());
		map.put("prdt_id", order.getPrdtId());
		map.put("prdt_name", order.getPrdtName());
		map.put("prdt_rate", order.getPrdtRate());
		map.put("order_date", order.getOrderDate());
		map.put("order_placed", order.getOrderPlaced());
		map.put("user_id", order.getUserId());
		
		namedParameterJdbcTemplate.execute(OrderSql.PLACE_ORDER, map, new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return ps.executeUpdate();
			}
		});
		return true;
	}

	@Override
	public boolean cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		
		Map<String ,Object> map =new HashMap<>();
		map.put("order_id",orderId);
		
		namedParameterJdbcTemplate.execute(OrderSql.CANCEL_ORDER, map, new  PreparedStatementCallback<Object>() {
			
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			
				return ps.executeQuery();
			}
			
		});
		return true;
	}
	
}
