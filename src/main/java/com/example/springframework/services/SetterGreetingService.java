package com.example.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello...!!! Injected Using Setter.";
	}

}
