package com.zwt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwt.bean.Food;
import com.zwt.bean.FoodAndType;
import com.zwt.mapper.FoodTypeMapper;
import com.zwt.serviceImpl.FoodServiceImpl;
import com.zwt.serviceImpl.FoodTypeServiceImpl;

@Controller
@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodServiceImpl foodServiceImpl;
	
	@Autowired 
	private FoodTypeServiceImpl foodTypeServiceImpl;
	
	@RequestMapping(value="/addFood",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addFood(@RequestBody Map<String, Object> map){
		System.out.println(map.toString());
		return foodServiceImpl.addFood(map);
	}
	
	@RequestMapping(value="/showFood",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> showFood() {
		Map<String, Object> map=new HashMap<>();
		List<Food> foods=foodServiceImpl.showAllFood();
		List<FoodAndType> realFoods=new ArrayList<FoodAndType>();
		for (Food foods2 : foods) {
			realFoods.add(new FoodAndType(foods2.getFoodId(), 
					foodTypeServiceImpl.selectTypeById(foods2.getTypeId()).getTypeName(),
					foods2.getFoodName(), foods2.getFoodPrice(), foods2.getFoodImg(),
					foods2.getFoodInfo(), foods2.getMemberPrice()));
		}
		map.put("foods", realFoods);
		return map;
	}
	
	@RequestMapping(value="/updateFood",method=RequestMethod.POST)
	@ResponseBody
	public void updateFood(@RequestBody Map<String, Object> map){
		System.out.println(map.toString());
		System.out.println(map.get("foodId"));
		foodServiceImpl.updateFood(Integer.parseInt(map.get("foodId").toString()), Integer.parseInt(map.get("typeId").toString()),
				(String)map.get("foodName"), (double)map.get("foodPrice"), 
				(String)map.get("foodImg"), (String)map.get("foodInfo"), (double)map.get("memberPrice"));
	}
	
	@RequestMapping(value="/showFoodByTypeId",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> showFoodByTypeId(@RequestParam Integer typeId) {
		Map<String, Object> map=new HashMap<>();
		List<Food> foods=foodServiceImpl.selectFoodByTypeId(typeId);
		map.put("foods", foods);
		return map;
	}
	
	@RequestMapping(value="/showFoodByFoodId",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> showFoodByFoodId(@RequestParam Integer foodId) {
		Map<String, Object> map=new HashMap<>();
		Food foods=foodServiceImpl.selectFoodByFoodId(foodId);
		map.put("foods", foods);
		return map;
	}
}
