package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsApplication {
	
	@GetMapping("/")
	public String aws() {
		return "Spring boot application is deployed on AWS";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsApplication.class, args);
	}

}
