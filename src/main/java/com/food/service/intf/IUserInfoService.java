package com.food.service.intf;

import java.util.List;

import com.food.dao.model.UserInfo;

public interface IUserInfoService {

	//保存用户	
	public Boolean saveUserInfo(UserInfo userInfo);
	
	//查找用户
	public List<UserInfo>  findUserInfo(UserInfo temp);
	
}
