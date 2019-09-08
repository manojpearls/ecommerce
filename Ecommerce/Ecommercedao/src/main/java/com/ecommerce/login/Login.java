package com.ecommerce.login;

import java.time.LocalDateTime;

public class Login {

	private String userId;
	private String userName;
	private String userPwd;
	private String oldPwd;
	private String userAddress;
	private String userEmailid;
	private String mobileNo;
	private LocalDateTime registerDate;
	private LocalDateTime lastUpdate;
	
	public Login() {
		
	}
	
	public Login(String userId, String userName, String userPwd, String oldPwd, String userAddress, String userEmailid,
			String mobileNo, LocalDateTime registerDate, LocalDateTime lastUpdate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.oldPwd = oldPwd;
		this.userAddress = userAddress;
		this.userEmailid = userEmailid;
		this.mobileNo = mobileNo;
		this.registerDate = registerDate;
		this.lastUpdate = lastUpdate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmailid() {
		return userEmailid;
	}
	public void setUserEmailid(String userEmailid) {
		this.userEmailid = userEmailid;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}

	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
	
}
