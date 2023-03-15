package com.judell.dao;

import com.judell.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserModel, String> {
}
