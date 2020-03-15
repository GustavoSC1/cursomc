package com.gustavo.cursomc;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gustavo.cursomc.services.S3Service;

//CommandLineRunner é uma interface usada para indicar que um bean deve ser executado 
//quando estiver contido em um SpringApplication.  
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;
	
	//A anotação PostConstruct é usada em um método que precisa ser executado após a injeção de dependência 
	//para executar qualquer inicialização. Este método deve ser invocado antes da classe ser colocada em serviço.
	@PostConstruct
    void started() {
      TimeZone.setDefault(TimeZone.getTimeZone("Hora oficial do Brasil"));
    }
		
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\Gustavo\\Pictures\\teste\\good2.jpg");
	}

}
