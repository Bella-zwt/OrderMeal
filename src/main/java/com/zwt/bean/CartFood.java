package com.zwt.bean;

public class CartFood {
	
	private Food food;
	private Cart cart;
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public CartFood(Food food, Cart cart) {
		super();
		this.food = food;
		this.cart = cart;
	}

}
