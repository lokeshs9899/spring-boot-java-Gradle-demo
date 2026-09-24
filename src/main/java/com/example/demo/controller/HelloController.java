package com.example.demo.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Spring Boot + Gradle is working.";
    }
    @GetMapping("/hello/{name}")
    public String helloByName(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }
}

