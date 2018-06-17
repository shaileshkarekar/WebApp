package com.webapp.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webapp.repository.EmployeeRepository;

@SpringBootApplication
public class AppApplication {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
	}
}
