package com.skyloop.service;

import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.UpdateCustomerResponse;

public interface SkyloopService {

	public AddCustomerResponse addCustomer(Customer customer);

	public UpdateCustomerResponse updateCustomer(Customer customer);
}
