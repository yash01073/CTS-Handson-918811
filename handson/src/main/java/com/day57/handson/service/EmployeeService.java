package com.day57.handson.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day57.handson.model.Employee;
import com.day57.handson.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	@Transactional
	public Employee get(int id) {
		LOGGER.info("Start");
		
		return employeeRepository.findById(id).get();
		
	}
	@Transactional
	public void save(Employee employee) {
		LOGGER.info("End");
	}
	
	@Transactional
	public List<Employee> getAllPermanentEmployee(){
		LOGGER.info("Start");
		LOGGER.info("End");
		
	return employeeRepository.getAllPermanentEmployees();	
	}
	
	public double getAverageSalary(int id) {
		return employeeRepository.getAverageSalary(id);
		
	}
	
	public List<Employee> getAllEmployeesNative(){
		return employeeRepository.getAllEmployeesNative();
	}
} 
