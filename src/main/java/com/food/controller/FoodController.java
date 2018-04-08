package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.food.dao.model.FoodMessage;
import com.food.service.intf.IFoodMessageService;

@Controller
@SpringBootApplication
@RequestMapping("/food")
public class FoodController {

	@Autowired
	IFoodMessageService foodMessageService;
	
	@RequestMapping("/search")
	@ResponseBody 
	public FoodMessage search(@RequestParam("foodName") String foodname){
		
		System.out.println(foodname);
		
		FoodMessage temp = new FoodMessage();
		temp = foodMessageService.findFoodMessage(foodname);
		return temp;
	}
	
}
