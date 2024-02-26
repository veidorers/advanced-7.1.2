package com.example.eurekaservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/client/something")
    public String something() {
        return "It's the first client-service controller";
    }
}
