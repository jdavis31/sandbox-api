package com.judell.controllers;

import com.judell.constants.RouteConstants;
import com.judell.response.GenericResponse;
import com.judell.services.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @Autowired
    private HealthService healthService;

    @GetMapping(RouteConstants.HEALTH)
    public GenericResponse getHealth() {
        return healthService.getHealth();
    }
}
