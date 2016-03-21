package com.skyloop.sevice.model;

import java.util.List;

import com.skyloop.service.exception.ServiceException;

public class UpdateCustomerResponse {

	private Customer customer;
	private boolean status;
	private List<ServiceException> serviceExceptions;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<ServiceException> getServiceExceptions() {
		return serviceExceptions;
	}

	public void setServiceExceptions(List<ServiceException> serviceExceptions) {
		this.serviceExceptions = serviceExceptions;
	}

}
