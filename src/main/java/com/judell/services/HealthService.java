package com.judell.services;

import com.judell.response.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public GenericResponse getHealth() {
        GenericResponse genericResponse = new GenericResponse();

        genericResponse.setSuccess(true);
        genericResponse.setMessage("Healthy");
        genericResponse.setHttpStatus(HttpStatus.OK);

        return genericResponse;
    }
}
