package com.judell.requests;

import lombok.Data;

@Data
public class AddUserRequest {
    private String email;
    private String firstName;
    private String lastName;
}
