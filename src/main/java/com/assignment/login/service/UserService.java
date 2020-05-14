package com.assignment.login.service;

import org.springframework.stereotype.Service;

import com.assignment.login.model.Login;
import com.assignment.login.model.User;

@Service
public interface UserService {

  void addUser(User user);

  User validateUser(Login login);
}
