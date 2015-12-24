package com.sample.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestClient {

	public static void main(String[] args) {
		SpringApplication.run(TestClient.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Spring Cloud Client Application Started";
	}
}
