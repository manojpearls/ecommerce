package com.ecommerce.login;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl  implements LoginRepository{

  
	private DataSource dataSource;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate.setDataSource(dataSource);
		
		//this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
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
		map.put("register_date", login.getRegisterDate());
		map.put("last_update", login.getLastUpdate());
		
		
	
		MapSqlParameterSource map1=new MapSqlParameterSource();
		map1.addValue("user_id", login.getUserId());
		map1.addValue("user_name", login.getUserName());
		map1.addValue("user_pwd", login.getUserPwd());
		map1.addValue("old_pwd", login.getOldPwd());
		map1.addValue("user_address", login.getUserAddress());
		map1.addValue("user_emailid", login.getUserEmailid());
		map1.addValue("mobile_no", login.getMobileNo());
		map1.addValue("register_date", login.getRegisterDate());
		map1.addValue("last_update", login.getLastUpdate());
		
		
		
		namedParameterJdbcTemplate.execute(LoginSql.REGISTER_LOGIN, map1, new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return ps.executeUpdate();
			}
		});
		
		return true;
	}

	@Override
	public boolean validate(String userId,String password) {
		// TODO Auto-generated method stub
		Map<String ,Object> map =new HashMap<>();
		//System.out.println(login.getUserName());
		//System.out.println(login.getUserPwd());
		System.out.println(LoginSql.VALIDATE_LOGIN);
		map.put("user_id",userId);
		map.put("user_pwd", password);
/*		List<Login> list=jdbcTemplate.query(LoginSql.VALIDATE_LOGIN, new Object[] {userId,password}, (rs,rowNum)-> new Login(rs.getString("user_id"),rs.getString("user_name"),
				rs.getString("user_pwd"),rs.getString("old_pwd"),rs.getString("user_address"),rs.getString("user_emailid"),rs.getString("mobile_no"),null,null) {
						});*/
		//List<Login> list=jdbcTemplate.query(LoginSql.VALIDATE_LOGIN, new Object[] {userId,password},new LoginRowMapper());
		List<Login> list=jdbcTemplate.query(LoginSql.VALIDATE_LOGIN, new Object[] {userId,password},BeanPropertyRowMapper.newInstance(Login.class));
	
		if(!list.isEmpty() && list.size()==1) {
			return true;
		}else {
			return false;
		}
	}
 
	@Override
	public boolean delete (String userId)
	{
		// TODO Auto-generated method stub
		Map<String ,Object> map =new HashMap<>();
		//System.out.println(login.getUserId());
		map.put("user_id",userId);
		
		namedParameterJdbcTemplate.execute(LoginSql.DELETE_LOGIN, map, new  PreparedStatementCallback<Object>() {
			
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			
				return ps.executeQuery();
			}
			
		});
		
		
		
		return true;
	
	}
	
	}
