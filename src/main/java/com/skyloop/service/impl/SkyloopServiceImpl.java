package com.skyloop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.skyloop.db.dao.CustomerDao;
import com.skyloop.service.SkyloopService;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.UpdateCustomerResponse;

@Component("SkyloopServiceImpl")
public class SkyloopServiceImpl implements SkyloopService {
	@Autowired
	@Qualifier("CustomerDaoImpl")
	private CustomerDao customerDao;

	public AddCustomerResponse addCustomer(Customer customer) {
		return customerDao.addCustomer(null);
	}

	public UpdateCustomerResponse updateCustomer(Customer customer) {
		return customerDao.updateCustomer(null);
	}

}
