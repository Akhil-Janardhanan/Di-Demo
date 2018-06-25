package com.example.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.springframework.services.GreetingRepository;
import com.example.springframework.services.GreetingService;
import com.example.springframework.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

	@Bean
	public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		
		return new GreetingServiceFactory(greetingRepository);
	}
	
	@Bean
	@Primary
	@Profile({"default", "en"})
	public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		
		return greetingServiceFactory.createGreetingService("en");
	}
	
	@Bean
	@Primary
	@Profile("de")
	public GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		
		return greetingServiceFactory.createGreetingService("de");
	}
	
	@Bean
	@Primary
	@Profile("es")
	public GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		
		return greetingServiceFactory.createGreetingService("es");
	}
}
