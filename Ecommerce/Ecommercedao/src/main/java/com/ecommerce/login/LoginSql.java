package com.ecommerce.login;

public interface LoginSql {
	
	public final static String REGISTER_LOGIN="INSERT INTO LOGIN(user_id,user_name,user_pwd,old_pwd,user_address,user_emailid,mobile_no,register_date,last_update) "
			+ "VALUES(:user_id,:user_name,:user_pwd,:old_pwd,:user_address,:user_emailid,:mobile_no,:register_date,:last_update)";

}
