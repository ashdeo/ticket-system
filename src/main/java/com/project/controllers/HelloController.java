package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.services.HelloService;
@RestController
public class HelloController {
	
	private final HelloService helloService;

	@Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

	@GetMapping("/hello")
    public String sayHello() {
        return helloService.getMessage();
    }
	
	@GetMapping("/")
	    public String welcome() {
	        return "Welcome to my Spring Boot application!";
	    }
}
