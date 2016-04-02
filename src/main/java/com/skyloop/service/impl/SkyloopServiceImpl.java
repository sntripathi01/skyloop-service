package com.skyloop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skyloop.db.repository.CustomerRepository;
import com.skyloop.service.SkyloopService;
import com.skyloop.service.helper.ServiceMapper;
import com.skyloop.service.validator.ServiceValidator;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.UpdateCustomerResponse;

@Component("SkyloopServiceImpl")
public class SkyloopServiceImpl implements SkyloopService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ServiceValidator serviceValidator;

	public AddCustomerResponse addCustomer(Customer customer) {
		serviceValidator.validateAddCustomer(customer);
		AddCustomerResponse response = new AddCustomerResponse();
		com.skyloop.db.model.Customer customerDb  = customerRepository.save(ServiceMapper.mapCustomerRequest(customer));
		response.setCustomer(ServiceMapper.mapCustomerResponse(customerDb));
		return response;
	}

	public UpdateCustomerResponse updateCustomer(Customer customer) {
		//return customerDao.updateCustomer(null);
		return null;
	}

}
