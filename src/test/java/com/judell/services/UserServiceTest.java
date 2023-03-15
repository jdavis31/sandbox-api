package com.judell.services;

import com.judell.dao.UserDao;
import com.judell.models.UserModel;
import com.judell.requests.AddUserRequest;
import com.judell.response.GenericResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    UserDao userDao;

    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addUserSuccessTest() {
        // Given
        UserModel userModel = new UserModel();

        userModel.setFirstName("Bryan");
        userModel.setLastName("Wilson");
        userModel.setEmail("bwilson@gmail.com");

        AddUserRequest addUserRequest = new AddUserRequest();

        addUserRequest.setEmail("bwilson@gmail.com");
        addUserRequest.setFirstName("Bryan");
        addUserRequest.setLastName("Wilson");

        GenericResponse expectedGenericResponse = new GenericResponse();

        expectedGenericResponse.setSuccess(true);
        expectedGenericResponse.setData(userModel);
        expectedGenericResponse.setHttpStatus(HttpStatus.OK);
        expectedGenericResponse.setMessage("User added");

        // When
        when(userDao.save(any())).thenReturn(new UserModel());

        GenericResponse actualGenericResponse = userService.addUser(addUserRequest);

        //Then
        assertEquals(actualGenericResponse, expectedGenericResponse);
    }
}
