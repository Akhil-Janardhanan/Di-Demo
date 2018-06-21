package com.example.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public static final String GREETING = "Hello Folks....!!!!";
	
	@Override
	public String sayHello() {
	
		return GREETING;
	}

}
