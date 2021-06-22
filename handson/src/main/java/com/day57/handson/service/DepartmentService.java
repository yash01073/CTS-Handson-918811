package com.day57.handson.service;

import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day57.handson.model.Department;
import com.day57.handson.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	
		@Autowired
		private DepartmentRepository departmentRepository;
		private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
		
		@Transactional
		public Department get(int id) {
			LOGGER.info("Start");
			
			return departmentRepository.findById(id).get();
		
	}
}
