package com.assignment.login.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.assignment.login.model.Login;
import com.assignment.login.service.UserService;

@Controller
public class HomeController {

  @Autowired
  public UserService userService;

  @GetMapping("/")
  public String home(Map<String, Object> map) {
    return "home";
  }

  @GetMapping("/showLoginPage")
  public String showLoginPage(ModelMap model) {
    model.addAttribute(new Login());

    return "login";
  }

}
