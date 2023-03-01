package com.upgrad.MovieServiceCircuitBreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MovieServiceCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceCircuitBreakerApplication.class, args);
	}
}
