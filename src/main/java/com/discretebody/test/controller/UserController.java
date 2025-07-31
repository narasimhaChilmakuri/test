package com.discretebody.test.controller;


import com.discretebody.test.entity.Users;
import com.discretebody.test.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UsersService usersService;


    @GetMapping("/r1")
    public String welcome() {
        return "Welcome to the User Registration Service!";
    }

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return usersService.register(user);
    }


}
