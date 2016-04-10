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
@Table(name = "paymentInfo")
public class PaymentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String meymentMode;
	private long orderId;
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean status;
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean delStatus;
	private Date orderCreatedDate;
	private Date orderModifiedDate;
	private Date deletedDate;
	@OneToOne
	@JoinColumn(name = "orderId", insertable = false, updatable = false)
	private Order order;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMeymentMode() {
		return meymentMode;
	}

	public void setMeymentMode(String meymentMode) {
		this.meymentMode = meymentMode;
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

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
