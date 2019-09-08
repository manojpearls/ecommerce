package com.ecommerce.product;

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
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public boolean register(Product product) {
		// TODO Auto-generated method stub
		
		Map<String,Object> map=new HashMap<>();
		map.put("prdt_id", product.getPrdtId());
		map.put("prdt_name", product.getPrdtName());
		map.put("prdt_image", product.getPrdtImage());
		map.put("brand_name", product.getBrandName());
		map.put("prdt_color",product.getPrdtColor() );
		map.put("prdt_rate", product.getPrdtRate());
		map.put("prdt_in_date",product.getPrdtInDate());
		map.put("prdt_purchased",product.getPrdtPurchased());
		
		namedParameterJdbcTemplate.execute(ProductSql.REGISTER_PRODUCT, map, new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				System.out.println("test......");
				
				return ps.executeUpdate();
				
			}
		});


		return false;
	}

	@Override
	public boolean delete(String prdtId) {
		// TODO Auto-generated method stub
		Map<String ,Object> map =new HashMap<>();
		map.put("product_id",prdtId);
		
		namedParameterJdbcTemplate.execute(ProductSql.DELETE_PRODUCT, map, new  PreparedStatementCallback<Object>() {
			
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			
				return ps.executeQuery();
			}
			
		});
		
		return true;
	}

}
