package com.forum.enicarthage.controller;

import com.forum.enicarthage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
  @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("user/{password}/{username}")

    public int UserLogin(@PathVariable("password") String password1,@PathVariable("username") String username1)  {
        int flag =userService.loginValidation(password1, username1);
        if (flag==0) return 0;
        return  flag;
    }
}