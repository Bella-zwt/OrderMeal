package com.zwt.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zwt.bean.Food;

public interface FoodService {
	
	//添加菜品
	public Map<String, String> addFood(Map<String, Object> food);
	
	//查询所有的菜品
	public List<Food> showAllFood();
	
	//根据菜品id修改菜品信息
	public void updateFood(Integer foodId,Integer typeId,String foodName,double foodPrice,String foodImg,String foodInfo,double memberPrice);
	
	//根据菜品种类筛选菜品
	public List<Food> selectFoodByTypeId(Integer typeId);
	
	//根据菜品id筛选菜品
	public Food selectFoodByFoodId(Integer foodId);
}
