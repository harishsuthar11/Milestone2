package com.example.milestone2.controller;


import com.example.milestone2.model.User;
import com.example.milestone2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
