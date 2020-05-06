package com.zwt.bean;

import java.sql.Date;

public class Customer {
	
	private Integer customerId;
	
	private String openId;
	
	private String nickName;
	
	private String sex;
	
	private Boolean isMember;
	
	private String headImg;
	
	private String memberNumber;
	
	private Date memberTime;

	public Customer() {
	}

	public Customer(Integer customerId, String openId, String nickName, String sex, Boolean isMember, String headImg,
			String memberNumber, Date memberTime) {
		super();
		this.customerId = customerId;
		this.openId = openId;
		this.nickName = nickName;
		this.sex = sex;
		this.isMember = isMember;
		this.headImg = headImg;
		this.memberNumber = memberNumber;
		this.memberTime = memberTime;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getIsMember() {
		return isMember;
	}

	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	public Date getMemberTime() {
		return memberTime;
	}

	public void setMemberTime(Date memberTime) {
		this.memberTime = memberTime;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", openId=" + openId + ", nickName=" + nickName + ", sex=" + sex
				+ ", isMember=" + isMember + ", headImg=" + headImg + ", memberNumber=" + memberNumber + ", memberTime="
				+ memberTime + "]";
	}
	
	
}
