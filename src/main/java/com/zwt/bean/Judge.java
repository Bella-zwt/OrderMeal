package com.zwt.bean;

import java.sql.Date;

public class Judge {

	private Integer customerId;
	
	private Integer foodId;
	
	private String jContent;
	
	private Date judgeTime;

	public Judge() {
		
	}

	public Judge(Integer customerId, Integer foodId, String jContent, Date judgeTime) {
		super();
		this.customerId = customerId;
		this.foodId = foodId;
		this.jContent = jContent;
		this.judgeTime = judgeTime;
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

	public String getjContent() {
		return jContent;
	}

	public void setjContent(String jContent) {
		this.jContent = jContent;
	}

	public Date getJudgeTime() {
		return judgeTime;
	}

	public void setJudgeTime(Date judgeTime) {
		this.judgeTime = judgeTime;
	}

	@Override
	public String toString() {
		return "Judge [customerId=" + customerId + ", foodId=" + foodId + ", jContent=" + jContent + ", judgeTime="
				+ judgeTime + "]";
	}
	
}
