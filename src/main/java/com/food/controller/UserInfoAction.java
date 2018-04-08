package com.food.controller;

import java.util.ArrayList;
import java.util.List;

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
	
	@RequestMapping("/login")
	@ResponseBody 
	public String login(UserInfo userInfo){
		
		List<UserInfo> temp = new ArrayList<UserInfo>();
		temp = userInfoService.findUserInfo(userInfo);
		if(temp.size() == 0){
			return "0";
		}else{
			return "1";
		}
		
	}
}
