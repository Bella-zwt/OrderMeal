package com.zwt.bean;




public class Collection {

	private Integer customerId;
	
	private Integer foodId;

	public Collection() {
		
	}

	public Collection(Integer customerId, Integer foodId) {
		super();
		this.customerId = customerId;
		this.foodId = foodId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	@Override
	public String toString() {
		return "collection [customerId=" + customerId + ", foodId=" + foodId + "]";
	}
	
	
}
