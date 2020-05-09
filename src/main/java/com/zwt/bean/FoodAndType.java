package com.zwt.bean;

public class FoodAndType {

	private Integer foodId;//foodID
	
	private String typeName;//种类名称
	
	private String foodName;//菜品名称
	
	private double foodPrice;//菜品价格
	
	private String foodImg;//菜品图片
	
	private String foodInfo;//菜品简介
	
	private double memberPrice;//会员价格

	public FoodAndType() {
		
	}

	public FoodAndType(Integer foodId, String typeName, String foodName, double foodPrice, String foodImg, String foodInfo,
			 double memberPrice) {
		super();
		this.foodId = foodId;
		this.typeName = typeName;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodImg = foodImg;
		this.foodInfo = foodInfo;
		this.memberPrice = memberPrice;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeId(String typeName) {
		this.typeName = typeName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodImg() {
		return foodImg;
	}

	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}

	public String getFoodInfo() {
		return foodInfo;
	}

	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
	}

	public double getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(double memberPrice) {
		this.memberPrice = memberPrice;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", typeName=" + typeName + ", foodName=" + foodName + ", foodPrice=" + foodPrice
				+ ", foodImg=" + foodImg + ", foodInfo=" + foodInfo + ", memberPrice=" + memberPrice + "]";
	}
	
}
