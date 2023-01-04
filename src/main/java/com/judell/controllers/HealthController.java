package com.judell.controllers;

import com.judell.services.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @Autowired
    private HealthService healthService;

    @GetMapping("/spring-sandbox/health")
    public HttpStatus getHealth() {
        return healthService.getHealth();
    }
}
