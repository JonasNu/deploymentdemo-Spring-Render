package com.example.deploymentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeploymentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentdemoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer(){
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("https://goodsun-frontend.onrender.com")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
						.allowedHeaders("*")
						.allowCredentials(true);
			}
		};
	}
}