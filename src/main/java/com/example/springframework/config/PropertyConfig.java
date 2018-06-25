package com.example.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.example.springframework.examplebeans.FakeDataSource;
import com.example.springframework.examplebeans.FakeJmsDataSource;

@Configuration
/*//@PropertySource("classpath:datasource.properties")
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})*/
public class PropertyConfig {

	@Value("${com.username}")
	public String user;
	
	@Value("${com.password}")
	public String password;
	
	@Value("${com.dburl}")
	public String url;
	
	@Value("${com.jms.username}")
	public String jmsUser;
	
	@Value("${com.jms.password}")
	public String jmsPassword;
	
	@Value("${com.jms.url}")
	public String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsDataSource fakeJmsDataSource() {
		
		FakeJmsDataSource fakeJmsDataSource = new FakeJmsDataSource();
		fakeJmsDataSource.setUser(jmsUser);
		fakeJmsDataSource.setPassword(jmsPassword);
		fakeJmsDataSource.setUrl(jmsUrl);
		
		return fakeJmsDataSource;
	}
	
	/*@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}*/
}
