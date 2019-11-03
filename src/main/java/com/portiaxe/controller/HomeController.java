package com.portiaxe.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Bean
	private RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@RequestMapping("/")
	public String home() {
		// We load balance among them, and display which instance received the request.
		return "Hello from API Gateway";
	}
	

}
