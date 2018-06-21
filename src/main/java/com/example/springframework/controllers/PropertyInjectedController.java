package com.example.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingServiceImpl;

	public String sayHello() {
		return greetingServiceImpl.sayHello();
	}
		
}
