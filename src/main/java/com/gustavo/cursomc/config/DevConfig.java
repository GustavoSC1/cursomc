package com.gustavo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavo.cursomc.services.DBService;
import com.gustavo.cursomc.services.EmailService;
import com.gustavo.cursomc.services.SmtpEmailService;

//Indica que uma classe declara um ou mais @Bean métodos e pode ser processada pelo contêiner Spring para gerar definições de
//bean e solicitações de serviço para esses beans em tempo de execução.
@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		if(!"create".equals(strategy)) {
			return false;			
		}
	
		dbService.instantiateTestDataBase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}

}
