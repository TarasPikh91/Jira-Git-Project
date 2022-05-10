package com.git.service;

import com.git.db.UserContainer;
import com.git.domain.User;
import com.git.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserContainer userContainer;

    public UserService(UserContainer userContainer) {
        this.userContainer = userContainer;
    }

    public boolean saveUser(UserDto userDto) {
        return userContainer.addUser(userDto);
    }

    public List<User> getAllUsers() {
        final List<User> allUsers = userContainer.getAllUsers();
        if (allUsers.isEmpty()) {
            System.out.println("User container don't contain any user!");
        }
        return allUsers;
    }

    public boolean deleteUser(Long userId) {
        return userContainer.removeUserById(userId);
    }
}
