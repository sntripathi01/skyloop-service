package com.skyloop.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long userId;
	private long customerId;
	private long paymentId;
	private String serviceType;
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean status;
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean delStatus;
	private Date orderCreatedDate;
	private Date orderModifiedDate;
	private Date deleteddDate;
	@OneToOne
	@JoinColumn(name = "customerId", insertable = false, updatable = false)
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;
	@OneToOne
	@JoinColumn(name = "paymentId", insertable = false, updatable = false)
	private PaymentInfo paymentInfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public Date getDeleteddDate() {
		return deleteddDate;
	}

	public void setDeleteddDate(Date deleteddDate) {
		this.deleteddDate = deleteddDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

}
