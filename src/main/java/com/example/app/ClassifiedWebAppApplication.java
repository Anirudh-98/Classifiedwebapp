package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClassifiedWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassifiedWebAppApplication.class, args);
	}

}
