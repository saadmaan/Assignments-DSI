package com.assignment.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignment.login.model.Login;
import com.assignment.login.model.User;
import com.assignment.login.service.UserService;

@Controller
public class LoginController {

  @Autowired
  public UserService userService;

  @PostMapping(value = "/loginProcess")
  public String login(@ModelAttribute("login") Login login, BindingResult bindingResult, ModelMap model) {

    User user = userService.validateUser(login);

    boolean isValidUser = false;

    if (null != user && user.getEmail().equals(login.getEmail())
        && user.getPassword().equals(login.getPassword())) {
      isValidUser = true;
      model.addAttribute("email", user.getEmail());
    }

    return isValidUser ? "welcome" : "error";
  }
}
