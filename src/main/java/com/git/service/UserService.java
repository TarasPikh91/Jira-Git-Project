package com.git.service;

import com.git.db.UserContainer;
import com.git.domain.User;
import com.git.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    //commentsfa
    //asdfasdfasdfsdf
    // new comment added
    // TODO asfasdfsdf

    // TODO 2


    private final UserContainer userContainer;

    public UserService(UserContainer userContainer) {
        this.userContainer = userContainer;
    }

    public void saveUser(UserDto userDto) {
        userContainer.addUser(userDto);
    }

    public List<User> getAllUsers() {
        return userContainer.getAllUsers();
    }

    public UserDto getUserByName(String username) {
        return userContainer.getUserByUsername(username);
    }
}
