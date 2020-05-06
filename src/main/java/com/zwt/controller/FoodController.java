package com.zwt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwt.bean.Food;
import com.zwt.serviceImpl.FoodServiceImpl;

@Controller
@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodServiceImpl foodServiceImpl;
	
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
		map.put("foods", foods);
		return map;
	}
}
