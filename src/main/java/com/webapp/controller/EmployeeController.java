package com.webapp.controller;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.dto.EmployeeDto;
import com.webapp.service.EmployeeService;
import com.webapp.util.Constants;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	 // SLF4J's logging instance for this class
	 // We could have used LoggerFactory.getLogger(Slf4jSpringBootApplication.class) as well
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	// This is what SLF4J uses to bind to a specific logging implementation
	final StaticLoggerBinder binder = StaticLoggerBinder.getSingleton();

	@RequestMapping(value = Constants.SAVE_EMP, method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		LOGGER.debug("i m here");
		employeeService.save(employeeDto);
	}

	@RequestMapping(Constants.GET_ALL_EMPS)
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
