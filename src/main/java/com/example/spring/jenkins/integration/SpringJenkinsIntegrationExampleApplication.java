package com.example.spring.jenkins.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsIntegrationExampleApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Jenkins!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsIntegrationExampleApplication.class, args);
	}

}
