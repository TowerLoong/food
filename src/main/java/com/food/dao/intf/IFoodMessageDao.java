package com.food.dao.intf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.dao.model.FoodMessage;

@Repository
public interface IFoodMessageDao extends JpaRepository<FoodMessage,Integer>{

	public FoodMessage findByFoodName(String foodName);
}
