package com.eazybytes.helloworldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, welcome to course on Microservices";
	}
}
