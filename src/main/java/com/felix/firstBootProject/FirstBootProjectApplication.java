package com.felix.firstBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Client! Welcome to this website";
	}
	
	@RequestMapping("/{random}")
	public String random() {
		return "Fun Fact: There is an estimated 3 trillion trees on our planet";
	}
}
