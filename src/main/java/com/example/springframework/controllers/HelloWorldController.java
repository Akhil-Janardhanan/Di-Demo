package com.example.springframework.controllers;

import org.springframework.stereotype.Controller;

import com.example.springframework.services.GreetingService;

@Controller
public class HelloWorldController {

	private GreetingService greetingService;
	
	public HelloWorldController(GreetingService greetingService) {

		this.greetingService = greetingService;
	}

	public String print() {
		System.out.println("############----HELLO WORLD----###########");
		return greetingService.sayHello();
	}
}
