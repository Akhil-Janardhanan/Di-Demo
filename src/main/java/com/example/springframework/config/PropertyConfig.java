package com.example.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.example.springframework.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${com.username}")
	public String user;
	
	@Value("${com.password}")
	public String password;
	
	@Value("${com.dburl}")
	public String url;
	
	@Bean
	public FakeDataSource FakeDataSource() {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
