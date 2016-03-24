package com.skyloop.db.dao;

import com.skyloop.db.model.Customer;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.UpdateCustomerResponse;

public interface CustomerDao {
public AddCustomerResponse addCustomer(Customer customer);
public UpdateCustomerResponse updateCustomer(Customer customer);
}
