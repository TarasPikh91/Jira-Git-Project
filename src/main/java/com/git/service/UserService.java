package com.git.service;

import com.git.db.UserContainer;
import com.git.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserContainer userContainer;

    public UserService(UserContainer userContainer) {
        this.userContainer = userContainer;
    }

    public void saveUser(User user) {
        userContainer.addUser(user);
    }

    public List<User> getAllUsers() {
        return userContainer.getAllUsers();
    }
}
