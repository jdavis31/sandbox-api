package com.judell.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HealthServiceTest {

    HealthService healthService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        healthService = new HealthService();
    }

    @Test
    void divideTwoNumbersByZeroSuccess() {
        // Given
        var numerator = 4;
        var denominator = 0;

        // When
        int actualResponse = healthService.divideTwoNumbers(numerator, denominator);

        // Then
        int expectedResponse = 4;

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void divideTwoNumbersSuccess() {
        // Given
        var numerator = 4;
        var denominator = 4;

        // When
        int actualResponse = healthService.divideTwoNumbers(numerator, denominator);

        // Then
        int expectedResponse = 1;

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void divideAnotherTwoNumbersSuccess() {
        // Given
        var numerator = 4;
        var denominator = 4;

        // When
        int actualResponse = healthService.divideAnotherTwoNumbers(numerator, denominator);

        // Then
        int expectedResponse = 1;

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void divideTwoNumbersTestFail() {
        assertThrows(
                ArithmeticException.class, () -> healthService.divideAnotherTwoNumbers(2, 0)
        );
    }
}