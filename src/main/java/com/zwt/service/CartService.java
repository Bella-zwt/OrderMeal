package com.zwt.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zwt.bean.Cart;

public interface CartService {
	
	public void addCart(String openId,int foodId);
	public Cart selectCart(String openId,int foodId);
	public List<Cart> selectByOpenId(String openId);
	public void deleteAllCart(String openId);
	public void addNum(String openId,int foodId);
	public void subNum(String openId,int foodId);
}
