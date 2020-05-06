package com.zwt.service;

import java.util.List;
import java.util.Map;

import com.zwt.bean.FoodType;

public interface FoodTypeService {

	//显示所有菜品种类
	public  List<FoodType> showAllType();
	
	//添加菜品种类
	public Map<String, String> addFoodType(Map<String, Object> foodtype);
}
