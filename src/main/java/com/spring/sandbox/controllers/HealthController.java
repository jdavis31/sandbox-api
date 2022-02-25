package com.spring.sandbox.controllers;

import com.spring.sandbox.services.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @Autowired
    private HealthService healthService;

    @GetMapping("/sandbox/health")
    public String getHealth() {
        return healthService.getHealth();
    }
}
