package com.example.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApigatewaytwopatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewaytwopatientApplication.class, args);
	}

}
