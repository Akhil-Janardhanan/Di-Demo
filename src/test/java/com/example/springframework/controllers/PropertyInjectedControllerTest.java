package com.example.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.springframework.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		
		assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
	}
}
