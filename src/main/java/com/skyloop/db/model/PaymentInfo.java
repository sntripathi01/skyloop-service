package com.skyloop.db.model;

import java.util.Date;

public class PaymentInfo {
	private String id;
	private String meymentMode;
	private String oderId;
	private  boolean paymentStatus;
	private boolean delStatus;
	private Date orderCreatedDate;
	private Date orderModifiedDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMeymentMode() {
		return meymentMode;
	}
	public void setMeymentMode(String meymentMode) {
		this.meymentMode = meymentMode;
	}
	public String getOderId() {
		return oderId;
	}
	public void setOderId(String oderId) {
		this.oderId = oderId;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public boolean isDelStatus() {
		return delStatus;
	}
	public void setDelStatus(boolean delStatus) {
		this.delStatus = delStatus;
	}
	public Date getOrderCreatedDate() {
		return orderCreatedDate;
	}
	public void setOrderCreatedDate(Date orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}
	public Date getOrderModifiedDate() {
		return orderModifiedDate;
	}
	public void setOrderModifiedDate(Date orderModifiedDate) {
		this.orderModifiedDate = orderModifiedDate;
	}

}
