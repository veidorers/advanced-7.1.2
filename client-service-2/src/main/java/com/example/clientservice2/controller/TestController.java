package com.example.clientservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/client/something")
    public String something() {
        return "It's the second client-service controller";
    }
}

