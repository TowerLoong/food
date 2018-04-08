package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.food.dao.model.UserInfo;
import com.food.service.intf.IUserInfoService;

@Controller
@SpringBootApplication
@RequestMapping("/userInfo")
public class UserInfoAction {

	@Autowired
	private IUserInfoService userInfoService;
	
	@RequestMapping("/add")
	@ResponseBody 
	public UserInfo save(UserInfo userInfo){
		userInfoService.saveUserInfo(userInfo);
		
		return userInfo;
	}
}
