package com.example.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springframework.controllers.ConstructorInjectedController;
import com.example.springframework.controllers.HelloWorldController;
import com.example.springframework.controllers.PropertyInjectedController;
import com.example.springframework.controllers.SetterInjectedController;
import com.example.springframework.examplebeans.FakeDataSource;
import com.example.springframework.examplebeans.FakeJmsDataSource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		HelloWorldController helloWorldController = context.getBean(HelloWorldController.class);
		
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser() + "----------" + fakeDataSource.getPassword());
		FakeJmsDataSource fakeJmsDataSource = context.getBean(FakeJmsDataSource.class);
		System.out.println(fakeJmsDataSource.getUser() + "----------" + fakeJmsDataSource.getPassword());
		System.out.println(helloWorldController.print());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		//System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		//System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
