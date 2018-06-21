package com.example.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.springframework.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController getterInjectedController;
	
	@Before
	public void setUp() throws Exception{
		
		this.getterInjectedController = new SetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting()throws Exception{
		
		assertEquals(GreetingServiceImpl.GREETING, getterInjectedController.sayHello());
	}
	
}
