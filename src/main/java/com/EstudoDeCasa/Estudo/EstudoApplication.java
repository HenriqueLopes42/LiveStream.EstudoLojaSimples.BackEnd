package com.EstudoDeCasa.Estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudoApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando programa.");
		SpringApplication.run(EstudoApplication.class, args);
		System.out.println("Programa inicializado.");
	}

}
