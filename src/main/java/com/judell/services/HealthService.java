package com.judell.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HttpStatus getHealth() {

        return HttpStatus.OK;
    }
}
