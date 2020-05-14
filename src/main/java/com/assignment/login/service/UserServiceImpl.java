package com.assignment.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.login.dao.UserRepository;
import com.assignment.login.model.Login;
import com.assignment.login.model.User;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  public UserRepository userRepo;

  public void addUser(User user) {
    userRepo.save(user);
  }

  public User validateUser(Login login) {
    return userRepo.findById(login.getEmail()).get();
  }

}
