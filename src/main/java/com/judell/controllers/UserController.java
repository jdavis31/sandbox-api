package com.judell.controllers;

import com.judell.constants.RouteConstants;
import com.judell.requests.AddUserRequest;
import com.judell.response.GenericResponse;
import com.judell.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(RouteConstants.ADD_USER)
    public GenericResponse addUser(@RequestBody AddUserRequest addUserRequest) {

        return userService.addUser(addUserRequest);
    }
}
