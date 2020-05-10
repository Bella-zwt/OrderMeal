package com.zwt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zwt.bean.Cart;
import com.zwt.bean.CartFood;
import com.zwt.service.CartService;
import com.zwt.serviceImpl.CartServiceImpl;
import com.zwt.serviceImpl.FoodServiceImpl;

@Controller
@RequestMapping("cart")
public class CartController {
	
	@Autowired
	private CartServiceImpl cartSertvice;
	@Autowired
	private FoodServiceImpl foodService;
	
	@RequestMapping("addCart")
	@ResponseBody
	public Map<String, Object> addCart(@RequestParam String openId,@RequestParam int foodId) {
		Map<String, Object> map2 = new HashMap<String, Object>();
		System.out.println(openId);
		System.out.println(foodId);
		Cart cart = cartSertvice.selectCart(openId, foodId);
		if (cart!=null) {
			map2.put("msg", "购物车已经存在该菜品");
		} else {
			cartSertvice.addCart(openId, foodId);
			map2.put("msg", "加入购物车成功！");
		}
		return map2;
	}
	@RequestMapping("loadCart")
	@ResponseBody
	public Map<String, Object> loadCart(@RequestParam String openId) {
		Map<String, Object> map2 = new HashMap<String, Object>();
		System.out.println(openId);
		List<Cart> carts = cartSertvice.selectByOpenId(openId);
		List<CartFood> realCarts = new ArrayList<CartFood>();
		for (Cart cart : carts) {
			realCarts.add(new CartFood(foodService.selectFoodByFoodId(cart.getFoodId()), cartSertvice.selectCart(openId, cart.getFoodId())));
		}
		map2.put("foods", realCarts);
		return map2;
	}

}
