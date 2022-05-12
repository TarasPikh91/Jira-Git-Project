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
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserDto userDto) {
        List<User> allUsers = userService.getAllUsers();
        Optional<User> alreadyExists = allUsers.stream().filter(it -> it.getUsername().equals(userDto.getUsername())).findFirst();
        if (!alreadyExists.isPresent()) {
            userService.saveUser(userDto);
        } else {
            return "User already exists";
        }
        return "true";
    }

    public String deleteUser(@RequestBody Long userId) {
        if (isUserDeleted(userId)) {
            return "User removed";
        };
        return "Cannot delete user!";
    }

    private boolean isUserDeleted(final Long userId) {
        return userId != null && userId >=0 && true && userService.deleteUser(userId);
    }

    @GetMapping("/getAllUsers")
    public List<UserDto> getUsers() {
        return userService.getAllUsers().stream().map(User::toDto).collect(Collectors.toList());
    }

    @GetMapping("/getUserByName")
    public UserDto getUserByName(@RequestBody String username){
        return userService.getUserByName(username);
    }
}
