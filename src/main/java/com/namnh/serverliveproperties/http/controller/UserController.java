package com.namnh.serverliveproperties.http.controller;

import com.namnh.serverliveproperties.http.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return new User(id, "Cantonese");
    }
}
