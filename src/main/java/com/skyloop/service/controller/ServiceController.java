package com.skyloop.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@RequestMapping("/test")
	public String test(){
		return "Test meassge";
	}

}
