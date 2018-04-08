package com.food.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "t_user_info")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "user_name" , nullable = true , length = 100) 
	private String userName;
	
	@Column(name = "user_pass" , nullable = true , length = 100)
	private String userPass;
	
	@Column(name = "user_email" , nullable = true , length = 100)
	private String userEmail;
	
	@Column(name = "user_phone" , nullable = true , length = 100)
	private String userPhone;
	
	@Column(name = "user_sex" , nullable = true , length = 100)
	private String userSex;
	
	@Column(name = "user_age" , nullable = true , length = 100)
	private String userAge;
	
	@Column(name = "user_message" , nullable = true , length = 100)
	private String userMessage;

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", userEmail="
				+ userEmail + ", userPhone=" + userPhone + ", userSex=" + userSex + ", userAge=" + userAge
				+ ", userMessage=" + userMessage + "]";
	}

	public UserInfo(Integer userId, String userName, String userPass, String userEmail, String userPhone,
			String userSex, String userAge, String userMessage) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userMessage = userMessage;
	}

	public UserInfo() {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	
}
