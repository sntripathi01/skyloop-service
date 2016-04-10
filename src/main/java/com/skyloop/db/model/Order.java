package com.skyloop.db.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "order")
public class Order {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long userId;
	private long customerId;
	private long paymentId;
	private String serviceType;
	private boolean status;
	private boolean delStatus;
	private Date orderCreatedDate;
	private Date orderModifiedDate;
	private Date deleteddDate;

}
