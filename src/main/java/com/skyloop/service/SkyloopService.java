package com.skyloop.service;

import java.util.List;

import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.UpdateCustomerResponse;

public interface SkyloopService {

	public AddCustomerResponse addCustomer(Customer customer);

	public UpdateCustomerResponse updateCustomer(Customer customer);

	public List<Customer> findCustomer(String coulmName, String coulmValue);
}
