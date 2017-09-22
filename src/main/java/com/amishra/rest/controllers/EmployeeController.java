package com.amishra.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amishra.dao.EmployeeRepository;
import com.amishra.model.Employee;



@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//private static final Logger myLogger = LoggerFactory.getLogger(EmployeeController.class);
	
	@RequestMapping(value = "rest/employee/{id}", method = RequestMethod.GET )
	
	public @ResponseBody Employee getEmployee(@PathVariable("id") int id)	{			
			Employee employee = employeeRepository.getEmployee(id); 
			return employee;				
	}
}
