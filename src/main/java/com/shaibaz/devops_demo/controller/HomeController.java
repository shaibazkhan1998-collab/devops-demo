package com.shaibaz.devops_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello DevOps Version 2!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Healthy";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 1.0";
    }
}