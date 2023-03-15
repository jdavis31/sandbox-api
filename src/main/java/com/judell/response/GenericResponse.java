package com.judell.response;

import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Data
@Getter
public class GenericResponse {
    private String message;
    private boolean success;
    private HttpStatus httpStatus;
    private Object data;

    public GenericResponse() {
        this.success = false;
        this.data = null;
        this.message = "";
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
