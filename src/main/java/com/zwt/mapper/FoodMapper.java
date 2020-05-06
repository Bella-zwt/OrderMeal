package com.zwt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.zwt.bean.Food;

@Component
public interface FoodMapper {
	//将菜品信息插入到表中
	public void insertFood(@Param("foodId")Integer foodId,@Param("typeId")Integer typeId,@Param("foodName")String foodName,@Param("foodPrice")double foodPrice,@Param("foodImg")String foodImg,@Param("foodInfo")String foodInfo,@Param("saleNumber")Integer saleNumber,@Param("memberPrice")double memberPrice);
	
	//展示菜品信息
	public List<Food> selectAllFood();
}
