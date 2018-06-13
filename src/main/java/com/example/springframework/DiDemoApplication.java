package com.example.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springframework.controller.HelloWorldController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		HelloWorldController helloWorldController = context.getBean(HelloWorldController.class);
		helloWorldController.print();
	}
}
