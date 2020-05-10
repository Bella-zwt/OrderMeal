package com.zwt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwt.bean.Cart;
import com.zwt.mapper.CartMapper;
import com.zwt.service.CartService;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartMapper cartMapper;

	@Override
	public void addCart(String openId, int foodId) {
		// TODO Auto-generated method stub
		cartMapper.addCart(openId, foodId);
	}

	@Override
	public Cart selectCart(String openId, int foodId) {
		// TODO Auto-generated method stub
		return cartMapper.selectCart(openId, foodId);
	}

	@Override
	public List<Cart> selectByOpenId(String openId) {
		// TODO Auto-generated method stub
		return cartMapper.selectByOpenId(openId);
	}

}
