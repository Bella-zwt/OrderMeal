package com.zwt.bean;

import java.sql.Date;

public class CusOrder {
	
	private String orderId;
	
	private Integer customerId;
	
	private Date orderTime;
	
	private Integer orderState;
	
	private double totalPrice;
	
	private String table;

	public CusOrder() {
		
	}

	public CusOrder(String orderId, Integer customerId, Date orderTime, Integer orderState, double totalPrice,
			String table) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderTime = orderTime;
		this.orderState = orderState;
		this.totalPrice = totalPrice;
		this.table = table;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return "CusOrder [orderId=" + orderId + ", customerId=" + customerId + ", orderTime=" + orderTime
				+ ", orderState=" + orderState + ", totalPrice=" + totalPrice + ", table=" + table + "]";
	}
	
}
