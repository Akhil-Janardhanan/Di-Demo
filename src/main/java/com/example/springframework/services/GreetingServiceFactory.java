package com.example.springframework.services;

public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;
	
	public GreetingServiceFactory(GreetingRepository greetingRepository) {

		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) {
		
		switch (lang) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);
		case "de":
			return new GermanGreetingService(greetingRepository);
		case "es":
			return new SpanishGreetingService(greetingRepository);
		default:
			return new PrimaryGreetingService(greetingRepository);
		}
	}
}
