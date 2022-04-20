package com.git.controller;

import com.git.db.UserContainer;
import com.git.domain.User;
import com.git.dto.UserDto;
import com.git.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
        List<User> allUsers = userService.getAllUsers();
        return "true";
    }

    @GetMapping("/getAllUsers")
    public List<UserDto> getUsers() {
        return userService.getAllUsers().stream().map(User::toDto).collect(Collectors.toList());
    }
}
