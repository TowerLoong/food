package com.food.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.dao.intf.IUserInfoDao;
import com.food.dao.model.UserInfo;
import com.food.service.intf.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService{

	@Autowired
    private	IUserInfoDao userInfoDao;
	
	@Override
	public Boolean saveUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
		userInfoDao.save(userInfo);
		
		return true;
	}

	@Override
	public List<UserInfo> findUserInfo(UserInfo temp) {
		// TODO Auto-generated method stub
		List<UserInfo> userList = new ArrayList<UserInfo>();
		userList = userInfoDao.findUserInfo(temp.getUserName(),temp.getUserPass());
		
		return userList;
	}	
	
}
