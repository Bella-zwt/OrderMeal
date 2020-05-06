package com.zwt.service;

import java.util.List;
import java.util.Map;

import com.zwt.bean.Food;

public interface FoodService {
	
	//添加菜品
	public Map<String, String> addFood(Map<String, Object> food);
	
	//查询所有的菜品
	public List<Food> showAllFood();
}
