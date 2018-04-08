package com.food.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "t_food_message")
public class FoodMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "food_id")
	private Integer foodId;
	
	@Column(name = "food_name" , nullable = true , length = 100) 
	private String foodName;
	
	@Column(name = "food_message" , nullable = true , length = 500) 
	private String foodMessage;

	@Override
	public String toString() {
		return "FoodMessage [foodId=" + foodId + ", foodName=" + foodName + ", foodMessage=" + foodMessage + "]";
	}

	public FoodMessage(Integer foodId, String foodName, String foodMessage) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodMessage = foodMessage;
	}

	public FoodMessage() {
		super();
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodMessage() {
		return foodMessage;
	}

	public void setFoodMessage(String foodMessage) {
		this.foodMessage = foodMessage;
	}
	
}
