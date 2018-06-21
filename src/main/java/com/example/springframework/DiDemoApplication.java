package com.example.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springframework.controllers.ConstructorInjectedController;
import com.example.springframework.controllers.HelloWorldController;
import com.example.springframework.controllers.PropertyInjectedController;
import com.example.springframework.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		HelloWorldController helloWorldController = context.getBean(HelloWorldController.class);
		helloWorldController.print();
		
		//System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		//System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
