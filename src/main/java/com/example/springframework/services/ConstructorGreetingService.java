package com.example.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello...!!! injected Using Constructor.";
	}

}
