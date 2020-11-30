package com.cg.entity;


import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cap_user")
public class User {
	
	@Id
	@Column(name = "user_id", length = 45)
	private String userID;
	
	@Column(name = "user_type",length = 45)
	private String userType;
	
	@JsonIgnore
	@Column(name = "password", length = 45)
	private String password;
	
	@Column(name = "user_name", length = 45)
	private String userName;
	
	@Column(name = "user_phone",length = 10)
	private BigInteger userPhone;
	
	@Column(name = "user_email",length = 45)
	private String email;

	public User(String userID, String userType, String password, String userName, BigInteger userPhone, String email) {
		super();
		this.userID = userID;
		this.userType = userType;
		this.password = password;
		this.userName = userName;
		this.userPhone = userPhone;
		this.email = email;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigInteger getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
