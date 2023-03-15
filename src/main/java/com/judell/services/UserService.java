package com.judell.services;

import com.judell.dao.UserDao;
import com.judell.models.UserModel;
import com.judell.requests.AddUserRequest;
import com.judell.response.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public GenericResponse addUser(AddUserRequest addUserRequest) {
        GenericResponse genericResponse = new GenericResponse();
        UserModel userModel = new UserModel();

        userModel.setFirstName(addUserRequest.getFirstName());
        userModel.setLastName(addUserRequest.getLastName());
        userModel.setEmail(addUserRequest.getEmail().toLowerCase());

        genericResponse.setMessage("User added");
        genericResponse.setSuccess(true);
        genericResponse.setHttpStatus(HttpStatus.OK);
        genericResponse.setData(userModel);

        userDao.save(userModel);

        return genericResponse;
    }
}
