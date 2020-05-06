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

import com.zwt.bean.FoodType;
import com.zwt.serviceImpl.FoodTypeServiceImpl;

@Controller
@RestController
@RequestMapping("/foodtype")
public class FoodTypeController {

	@Autowired
	private FoodTypeServiceImpl foodTypeService;
	
	@RequestMapping(value="/showType",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> showType() {
		Map<String, Object> map=new HashMap<>();
		List<FoodType> foodtype=foodTypeService.showAllType();
		map.put("foodtype", foodtype);
		return map;
	}
	
	@RequestMapping(value="/addType",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addFood(@RequestBody Map<String, Object> map){
		System.out.println(map.toString());
		return foodTypeService.addFoodType(map);
	}
}
