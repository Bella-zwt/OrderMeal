package com.zwt.bean;

public class Food {

	private Integer foodId;//foodID
	
	private Integer typeId;//种类ID
	
	private String foodName;//菜品名称
	
	private double foodPrice;//菜品价格
	
	private String foodImg;//菜品图片
	
	private String foodInfo;//菜品简介
	
	private Integer saleNumber;//默认是0，将菜品加到订单的时候，数量即为点了几个
	
	private double memberPrice;//会员价格

	public Food() {
		
	}

	public Food(Integer foodId, Integer typeId, String foodName, double foodPrice, String foodImg, String foodInfo,
			Integer saleNumber, double memberPrice) {
		super();
		this.foodId = foodId;
		this.typeId = typeId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodImg = foodImg;
		this.foodInfo = foodInfo;
		this.saleNumber = saleNumber;
		this.memberPrice = memberPrice;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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

	public Integer getSaleNumber() {
		return saleNumber;
	}

	public void setSaleNumber(Integer saleNumber) {
		this.saleNumber = saleNumber;
	}

	public double getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(double memberPrice) {
		this.memberPrice = memberPrice;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", typeId=" + typeId + ", foodName=" + foodName + ", foodPrice=" + foodPrice
				+ ", foodImg=" + foodImg + ", foodInfo=" + foodInfo + ", saleNumber=" + saleNumber + ", memberPrice="
				+ memberPrice + "]";
	}
	
}
