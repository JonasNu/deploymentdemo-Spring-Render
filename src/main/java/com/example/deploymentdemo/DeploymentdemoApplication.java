package com.example.deploymentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DeploymentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentdemoApplication.class, args);
	}

	@GetMapping("/test")
	public String getTest() {
		return "success";
	}
}