package com.judell.services;

import com.judell.response.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public GenericResponse getHealth() {
        GenericResponse genericResponse = new GenericResponse();

        genericResponse.setHttpStatus(HttpStatus.OK);
        genericResponse.setMessage("Healthy");

        return genericResponse;
    }

    public int divideTwoNumbers(int a, int b) {
        if (b == 0) {
            b = correctZero(b);
        }

        return a / b;
    }

    public int divideAnotherTwoNumbers(int a, int b) {

        return a / b;
    }

    private int correctZero(int zero) {

        return zero + 1;
    }
}
