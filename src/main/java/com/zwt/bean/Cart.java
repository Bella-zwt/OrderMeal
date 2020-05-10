package com.zwt.bean;

public class Cart {

	private String openId;
	private int foodId;
	private int num;
	public Cart() {
		super();
	}
	public Cart(String openId, int foodId, int num) {
		super();
		this.openId = openId;
		this.foodId = foodId;
		this.num = num;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Cart [openId=" + openId + ", foodId=" + foodId + ", num=" + num + "]";
	}
	
}
