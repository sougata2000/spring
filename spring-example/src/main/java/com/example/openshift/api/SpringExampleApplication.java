package com.example.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Java Springboot";
	}

	@GetMapping("/{inputs}")
	public String congrats(@PathVariable String inputs) {
		return "Welcome" + inputs;

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
