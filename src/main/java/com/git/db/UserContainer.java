package com.git.db;

import com.git.domain.User;
import com.git.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserContainer {

    private List<User> users;

    public boolean addUser(final UserDto userDto) {
        if (users == null) {
            users = new ArrayList<>();
        }
        return users.add(new User(userDto));
    }

    public List<User> getAllUsers() {
        return this.users;
    }
}
