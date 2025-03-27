package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@GetMapping("/")
public String home() {
    return "Welcome to the Spring Boot App!";
}

@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
