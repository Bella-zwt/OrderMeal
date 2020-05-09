package com.zwt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.zwt.bean.FoodType;

@Component
public interface FoodTypeMapper {

	//查询所有菜品种类
	public List<FoodType> selectAllType();
	
	//添加菜品种类
	public void insertFoodType(@Param("typeId")Integer typeId,@Param("typeName")String typeName);
	
	//根据id查种类
	public FoodType selectTypeById(@Param("typeId")Integer typeId);
}
