package com.skyloop.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skyloop.service.SkyloopService;
import com.skyloop.sevice.model.AddCustomerResponse;
import com.skyloop.sevice.model.Customer;
import com.skyloop.sevice.model.CustomerResponse;

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
	public ResponseEntity<AddCustomerResponse> addCustomer(@RequestBody Customer customer) {
		System.out.println("addCustomer Service is called");
		return new ResponseEntity<AddCustomerResponse>(service.addCustomer(customer), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/findCustomer", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> findCustomer(@RequestParam("coulmName") String coulmName,
			@RequestParam("coulmValue") String coulmValue) {
		System.out.println("findCustomer Service is called");
		return new ResponseEntity<List<Customer>>(service.findCustomer(coulmName, coulmValue), HttpStatus.OK);
	}
}
