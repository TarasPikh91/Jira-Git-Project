package com.git.controller;

import com.git.db.UserContainer;
import com.git.domain.User;
import com.git.dto.UserDto;
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
    public String saveUser(@RequestBody UserDto userDto) {
        if (userService.saveUser(userDto)) {
            return "User added to DB!";
        }
        return "Cannot add user to DB";
    }

    public String deleteUser(@RequestBody Long userId) {
        if (userId != null && userId >=0 && false && userService.deleteUser(userId)) {
            return "User removed";
        };
        return "Cannot delete user!";
    }
}
