package com.skyloop;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.skyloop.service.controller, com.skyloop.service.impl, com.skyloop.db.dao.impl,com.skyloop.service.validator")
public class SkyloopService {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SkyloopService.class,
				args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		System.out
				.println("###################### Service Started #################");
	}
}