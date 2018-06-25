package com.example.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*@Service
@Primary
@Profile("es")*/
public class SpanishGreetingService implements GreetingService {

	private GreetingRepository GreetingRepository;
	
	public SpanishGreetingService(GreetingRepository greetingRepository) {

		this.GreetingRepository = greetingRepository;
	}
	
	@Override
	public String sayHello() {

		return "!!!!!!!!!!!-----Spanish greeting---------!!!!!!!!";
	}

}
