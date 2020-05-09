package com.zwt.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwt.bean.FoodType;
import com.zwt.mapper.FoodTypeMapper;
import com.zwt.service.FoodTypeService;

@Service
public class FoodTypeServiceImpl implements FoodTypeService {

	@Autowired
	private FoodTypeMapper foodtypeMapper;
	
	@Override
	public List<FoodType> showAllType() {
		return foodtypeMapper.selectAllType();
	}

	@Override
	public Map<String, String> addFoodType(Map<String, Object> foodtype) {
		Map<String, String> map = new HashMap<String, String>();
		foodtypeMapper.insertFoodType(null, (String)foodtype.get("typeName"));
		map.put("insert", "success");
		return map;
	}

	@Override
	public FoodType selectTypeById(Integer typeId) {
		return foodtypeMapper.selectTypeById(typeId);
	}

}
