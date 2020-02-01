package com.gustavo.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//CommandLineRunner é uma interface usada para indicar que um bean deve ser executado 
//quando estiver contido em um SpringApplication. 
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
		
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
