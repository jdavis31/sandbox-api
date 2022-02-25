package com.spring.sandbox.services;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String getHealth() {

        return "OK";
    }
}
