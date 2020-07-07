package com.gustavo.cursomc;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Executa partes específicas de código quando um aplicativo é iniciado. CommandLineRunner é uma interface usada para indicar que 
//um bean deve ser executado quando estiver contido em um SpringApplication.  
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	
	//A anotação PostConstruct é usada em um método que precisa ser executado após a injeção de dependência 
	//para executar qualquer inicialização. Este método deve ser invocado antes da classe ser colocada em serviço.
	@PostConstruct
    void started() {
      TimeZone.setDefault(TimeZone.getTimeZone("Hora oficial do Brasil"));
    }
		
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	// O CommandLineRunner requer a implementação de um método (run) que recebe por parâmetro uma matriz de String.
	@Override
	public void run(String... args) throws Exception {
		
	}

}
