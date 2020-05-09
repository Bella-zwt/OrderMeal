package com.zwt.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwt.bean.Food;
import com.zwt.mapper.FoodMapper;
import com.zwt.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodMapper foodMapper;
	
	@Override
	public Map<String, String> addFood(Map<String, Object> food) {
		Map<String, String> map = new HashMap<String, String>();
		foodMapper.insertFood(null,(int)food.get("typeId"),(String)food.get("foodName"),
				(double)food.get("foodPrice"),(String)food.get("foodImg"),
				(String)food.get("foodInfo"),0,(double)food.get("memberPrice"));
		map.put("insert", "success");
		return map;
	}

	@Override
	public List<Food> showAllFood() {
		return foodMapper.selectAllFood();
	}

	@Override
	public void updateFood(Integer foodId, Integer typeId, String foodName, double foodPrice, String foodImg,
			String foodInfo, double memberPrice) {
		foodMapper.updateFood(foodId, typeId, foodName, foodPrice, foodImg, foodInfo, memberPrice);
	}

	@Override
	public List<Food> selectFoodByTypeId(Integer typeId) {
		return foodMapper.selectFoodByTypeId(typeId);
	}

	@Override
	public Food selectFoodByFoodId(Integer foodId) {
		return foodMapper.selectFoodByFoodId(foodId);
	}

	
}
