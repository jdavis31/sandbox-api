package com.judell.services;

import com.judell.response.GenericResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HealthServiceTest {

//    @InjectMocks
//    ApiService apiService;

//    @Mock
//    ApiService apiService;

    HealthService healthService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        healthService = new HealthService();
    }

    @Test
    void getHealthTestSuccess() {
        GenericResponse expectedResponse = new GenericResponse();

        expectedResponse.setSuccess(false);
        expectedResponse.setMessage("");
        expectedResponse.setHttpStatus(HttpStatus.BAD_REQUEST);

        GenericResponse actualResponse = new GenericResponse();



//        assertThat();
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