package com.food.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.dao.intf.IFoodMessageDao;
import com.food.dao.model.FoodMessage;
import com.food.service.intf.IFoodMessageService;

@Service
public class FoodMessageServiceImpl implements IFoodMessageService{

	@Autowired
	private IFoodMessageDao foodMessageDao;

	@Override
	public FoodMessage findFoodMessage(String foodName) {
		// TODO Auto-generated method stub
		
		FoodMessage temp = new FoodMessage();
		temp = foodMessageDao.findByFoodName(foodName);

		return temp;
	}
	
}
