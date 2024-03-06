package com.allesCoders.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class CiCdTestApplication {
	@GetMapping("/say-hello")
	public String sayHello() {
		return "Hello Guinea";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdTestApplication.class, args);
	}

}
