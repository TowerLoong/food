package com.food.service.intf;

import com.food.dao.model.FoodMessage;

public interface IFoodMessageService {

	public FoodMessage findFoodMessage(String foodName);
	
}
