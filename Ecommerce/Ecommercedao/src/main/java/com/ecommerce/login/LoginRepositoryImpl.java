package com.ecommerce.login;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl implements LoginRepository{

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public boolean register(Login login) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<>();
		map.put("user_id", login.getUserId());
		map.put("user_name", login.getUserName());
		map.put("user_pwd", login.getUserPwd());
		map.put("old_pwd", login.getOldPwd());
		map.put("user_address", login.getUserAddress());
		map.put("user_emailid", login.getUserEmailid());
		map.put("mobile_no", login.getMobileNo());
		map.put("register_date", null);
		map.put("last_update", null);
		
		namedParameterJdbcTemplate.execute(LoginSql.REGISTER_LOGIN, map, new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return ps.executeUpdate();
			}
		});
		return true;
	}

	@Override
	public boolean validate(Login login) {
		// TODO Auto-generated method stub
		return false;
	}

}
