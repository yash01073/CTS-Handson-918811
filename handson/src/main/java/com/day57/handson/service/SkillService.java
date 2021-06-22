package com.day57.handson.service;

import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day57.handson.model.Skill;
import com.day57.handson.repository.SkillRepository;



@Service
public class SkillService {
	
	
		@Autowired
		private SkillRepository skillRepository;
		private static final Logger LOGGER = LoggerFactory.getLogger(SkillService.class);
		
		@Transactional
		public Skill get(int id) {
			LOGGER.info("Start");
			
			return skillRepository.findById(id).get();
		
	}
}
