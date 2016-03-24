package com.skyloop.service.helper;

import com.skyloop.sevice.model.Customer;

public class ServiceMapper {

	public static com.skyloop.db.model.Customer mapCustomerRequest(Customer customer) {
		if (null == customer) {
			return null;
		}
		com.skyloop.db.model.Customer customerDb = new com.skyloop.db.model.Customer();
		customerDb.setEmail(customer.getEmail());
		customerDb.setAddress(customer.getAddress());
		customerDb.setCity(customer.getCity());
		customerDb.setState(customer.getState());
		customerDb.setCountry(customer.getCountry());
		customerDb.setCustomerType(customer.getCustomerType());
		customerDb.setFirstName(customer.getFirstName());
		customerDb.setMiddlename(customer.getMiddlename());
		customerDb.setLastName(customer.getLastName());
		customerDb.setMobile(customer.getMobile());
		customerDb.setLandLine(customer.getLandLine());
		customerDb.setCreatedDate(customer.getCreatedDate());
		customerDb.setModifiedDate(customer.getModifiedDate());
		return customerDb;
	}

}
