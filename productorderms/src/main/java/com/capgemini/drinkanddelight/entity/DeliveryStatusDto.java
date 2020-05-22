package com.capgemini.drinkanddelight.entity;

public class DeliveryStatusDto
{
	private  String orderId;
	private  String deliveryStatus;
	public DeliveryStatusDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeliveryStatusDto(String orderId, String deliveryStatus) {
		super();
		this.orderId = orderId;
		this.deliveryStatus = deliveryStatus;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	@Override
	public String toString() {
		return "DeliveryStatusDto [orderId=" + orderId + ", deliveryStatus=" + deliveryStatus + "]";
	}
	
}
