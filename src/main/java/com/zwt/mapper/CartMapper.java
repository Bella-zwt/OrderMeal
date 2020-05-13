package com.zwt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.zwt.bean.Cart;

@Component
public interface CartMapper {
	
	public void addCart(@Param("openId")String openId,@Param("foodId")int foodId);
	public Cart selectCart(@Param("openId")String openId,@Param("foodId")int foodId);
	public List<Cart> selectByOpenId(@Param("openId")String openId);
	public void deleteAllCart(@Param("openId")String openId);
	public void addNum(@Param("openId")String openId,@Param("foodId")int foodId);
	public void subNum(@Param("openId")String openId,@Param("foodId")int foodId);
}
