package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // enables component-scanning and auto-configuration

//We’ll need to register JPA 2.1 converters so that all the Java 8 Date/Time fields in the domain models 
//automatically get converted to SQL types when we persist them in the database.
public class JeddyHomesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeddyHomesApplication.class, args);
	}
}
