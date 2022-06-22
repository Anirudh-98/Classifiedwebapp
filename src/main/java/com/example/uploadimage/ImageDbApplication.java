package com.example.uploadimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImageDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageDbApplication.class, args);
	}

}
