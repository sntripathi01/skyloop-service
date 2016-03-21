package com.skyloop.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skyloop.service.SkyloopService;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;

@RestController
public class ServiceController {

	@Autowired
	@Qualifier("SkyloopServiceImpl")
	private SkyloopService service;

	@RequestMapping("/test")
	public String test() {
		return "Test meassge";
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public AddCustomerResponse addCustomer(@RequestBody Customer customer) {
		System.out.println("addCustomer Service is called");
		return service.addCustomer(customer);
	}
}
