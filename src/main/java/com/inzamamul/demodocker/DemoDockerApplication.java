package com.inzamamul.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {

	@GetMapping("/message")
	public String message() {
		return "Inzamamul Haque Spring Docker Image is Running";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}


}
