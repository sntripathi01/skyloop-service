package com.skyloop.db.dao.impl;

import org.springframework.stereotype.Component;

import com.skyloop.db.dao.CustomerDao;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.UpdateCustomerResponse;

@Component("CustomerDaoImpl")
public class CustomerDaoImpl implements CustomerDao {

	public AddCustomerResponse addCustomer(
			com.skyloop.db.model.Customer customer) {
		// TODO Auto-generated method stub
		return new AddCustomerResponse();
	}

	public UpdateCustomerResponse updateCustomer(
			com.skyloop.db.model.Customer customer) {
		// TODO Auto-generated method stub
		return new UpdateCustomerResponse();
	}

}
