package com.angularjspractice.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistenceConfiguration {

	//The @Bean annotation tells Spring and Spring Boot that the return value of this method, which is a DataSource  needs to
	// be set up and stored as a Spring bean in the Spring Context
	
	//The @ConfigurationProperties(prefix="spring.datasource") annotation tells the DataSourceBuilder to use the connection
	// and pull in the properties located in the application.properties file where the properties begin with the
	// spring.datasource prefix
	
	//The @Primary annotation tells Spring Boot to use this method as the default or primary datasource if there is 
	// any ambiguirity at the time of wiring up the application 
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	@Primary
	public DataSource dataSource() {		
		return DataSourceBuilder.create().build();
	}
	
	// Flyway DataSource
	
	// The @FlywayDataSource annotation is a specific spring annotation created for Flyway
	@Bean
	@ConfigurationProperties(prefix="spring.flyway")
	@FlywayDataSource
	public DataSource flywayDataSource() {		
		return DataSourceBuilder.create().build();
	}
}
