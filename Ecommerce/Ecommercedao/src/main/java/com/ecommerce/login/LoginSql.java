package com.ecommerce.login;

public interface LoginSql {
	 
	public final static String REGISTER_LOGIN="INSERT INTO LOGIN(user_id,user_name,user_pwd,old_pwd,user_address,user_emailid,mobile_no,register_date,last_update) "
			+ "VALUES(:user_id,:user_name,:user_pwd,:old_pwd,:user_address,:user_emailid,:mobile_no,:register_date,:last_update)";
	
	public final static String VALIDATE_LOGIN="SELECT * from LOGIN "+
            "WHERE  user_id=:user_id and user_pwd=:user_pwd ";

	public final static String DELETE_LOGIN="DELETE  FROM LOGIN "+
            "WHERE  user_id=:user_id ";

}
