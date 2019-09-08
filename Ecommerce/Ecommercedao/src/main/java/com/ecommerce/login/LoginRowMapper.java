package com.ecommerce.login;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoginRowMapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Login login = new Login();
		
		login.setUserId(rs.getString("user_id"));
		login.setUserName(rs.getString("user_name"));
		login.setUserPwd(rs.getString("user_pwd"));
		login.setOldPwd(rs.getString("old_pwd"));
		login.setUserAddress(rs.getString("user_address"));
		login.setUserEmailid(rs.getString("user_emailid"));
		login.setMobileNo(rs.getString("mobile_no"));
		
		
		return login;
	}

}
