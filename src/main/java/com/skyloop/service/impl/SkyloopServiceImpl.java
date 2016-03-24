package com.skyloop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.skyloop.db.dao.CustomerDao;
import com.skyloop.service.SkyloopService;
import com.skyloop.service.helper.ServiceMapper;
import com.skyloop.service.validator.ServiceValidator;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.UpdateCustomerResponse;

@Component("SkyloopServiceImpl")
public class SkyloopServiceImpl implements SkyloopService {
	@Autowired
	@Qualifier("CustomerDaoImpl")
	private CustomerDao customerDao;
	@Autowired
	private ServiceValidator serviceValidator;

	public AddCustomerResponse addCustomer(Customer customer) {
		serviceValidator.validateAddCustomer(customer);
		return customerDao.addCustomer(ServiceMapper.mapCustomerRequest(customer));
	}

	public UpdateCustomerResponse updateCustomer(Customer customer) {
		return customerDao.updateCustomer(null);
	}

}
