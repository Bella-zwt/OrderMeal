package com.zwt.bean;

public class OrderDetail {

	private Integer foodId;
	
	private String orderId;
	
	private Integer fCount;
	
	private double fPrice;

	public OrderDetail() {
	
	}

	public OrderDetail(Integer foodId, String orderId, Integer fCount, double fPrice) {
		super();
		this.foodId = foodId;
		this.orderId = orderId;
		this.fCount = fCount;
		this.fPrice = fPrice;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getfCount() {
		return fCount;
	}

	public void setfCount(Integer fCount) {
		this.fCount = fCount;
	}

	public double getfPrice() {
		return fPrice;
	}

	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}

	@Override
	public String toString() {
		return "OrderDetail [foodId=" + foodId + ", orderId=" + orderId + ", fCount=" + fCount + ", fPrice=" + fPrice
				+ "]";
	}
	
}
