package com.example.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware, 
	BeanFactoryAware, ApplicationContextAware{

	public LifeCycleBeanDemo() {

		System.out.println("## I'am in the LifeCycleBean constructor.");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("## Application context has been set.");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		System.out.println("## Bean factory has been set.");
	}

	@Override
	public void setBeanName(String name) {

		System.out.println("## My bean name is: " + name);
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("## The lifecycle has been terminated.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("## The lifecycle has its properties set.");
	}
	
	@PostConstruct
	public void postConstruct() {
		
		System.out.println("## The post construct annotated method has been called.");
	}

	@PreDestroy
	public void preDestroy() {
		
		System.out.println("## The pre destroy annotated methos has been called.");
	}
	
	public void beforeInit() {
		
		System.out.println("## - before init - Called by bean post processor.");
	}
	
	public void afterInit() {
		
		System.out.println("## - after init - Called by bean post processor.");
	}
}
