package com.skyloop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skyloop.db.repository.CustomerRepository;
import com.skyloop.db.repository.CustomerRepositoryCustom;
import com.skyloop.service.SkyloopService;
import com.skyloop.service.common.util.QueryConstant;
import com.skyloop.service.helper.ServiceMapper;
import com.skyloop.service.validator.ServiceValidator;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.CustomerResponse;
import com.skyloop.sevice.model.UpdateCustomerResponse;

@Component("SkyloopServiceImpl")
public class SkyloopServiceImpl implements SkyloopService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ServiceValidator serviceValidator;
	@Autowired
	private CustomerRepositoryCustom customerRepositoryCustom;

	public AddCustomerResponse addCustomer(Customer customer) {
		serviceValidator.validateAddCustomer(customer);
		AddCustomerResponse response = new AddCustomerResponse();
		com.skyloop.db.model.Customer customerDb = customerRepository.save(ServiceMapper.mapCustomerRequest(customer));
		response.setCustomer(ServiceMapper.mapCustomerResponse(customerDb));
		return response;
	}

	public UpdateCustomerResponse updateCustomer(Customer customer) {
		// return customerDao.updateCustomer(null);
		return null;
	}

	public List<Customer> findCustomer(String columName, String columValue) {
		List<com.skyloop.db.model.Customer> customerDb = customerRepository.findAll();
		List<Customer> customers = new ArrayList<Customer>();
		for (com.skyloop.db.model.Customer customer : customerDb) {
			customers.add(ServiceMapper.mapCustomerResponse(customer));
		}
		return customers;
		// List<com.skyloop.db.model.Customer> customerDb =
		// customerRepositoryCustom.findByColum(columName, columValue);
		// customerRepository.find1(QueryConstant.CUSTOMER_QUERY_COND);
		// customerRepository.
		// customerRepository.findAll();
		// customerRepository.findCustomer(coulmName, coulmValue);
		// customerRepository.findByFirstName( coulmValue);
	}

}
