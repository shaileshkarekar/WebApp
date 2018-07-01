package com.webapp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.webapp.repository.EmployeeRepository;

@SpringBootApplication(scanBasePackages= {"com.webapp"})
public class AppApplication extends SpringBootServletInitializer{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Bean
	ServletWebServerFactory servletWebServerFactory() {
		return new TomcatServletWebServerFactory();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
	}
}
