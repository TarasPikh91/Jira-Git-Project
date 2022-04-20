package com.git.controller;

import com.git.db.UserContainer;
import com.git.domain.User;
import com.git.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        List<User> allUsers = userService.getAllUsers();
        return "true";
    }
}
