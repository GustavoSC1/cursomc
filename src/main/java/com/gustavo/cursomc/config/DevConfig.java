package com.gustavo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> a3375c00c7620d097e5fde3eed4099c458bfe63f
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavo.cursomc.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
<<<<<<< HEAD
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		if(!"create".equals(strategy)) {
			return false;			
		}
		
=======
	@Bean
	public boolean instantiateDatabase() throws ParseException {
>>>>>>> a3375c00c7620d097e5fde3eed4099c458bfe63f
		dbService.instantiateTestDataBase();
		return true;
	}

}
