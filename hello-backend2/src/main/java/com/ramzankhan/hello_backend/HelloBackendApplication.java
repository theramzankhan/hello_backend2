package com.ramzankhan.hello_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class HelloBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloBackendApplication.class, args);
	}

}
