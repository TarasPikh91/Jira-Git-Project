package com.git.db;

import com.git.domain.User;
import com.git.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class UserContainer {

    private List<User> users;

    public void addUser(final UserDto userDto) {
        if (users == null) {
            users = new ArrayList<>();
        }
        users.add(new User(userDto));
    }

    public List<User> getAllUsers() {
        return this.users;
    }

    public UserDto getUserByUsername(String username) {
        Optional<User> first = users.stream().filter(it -> it.getUsername().equals(username)).findFirst();
        if (!first.isPresent()) {
            throw  new NoSuchElementException("dsf");
        }
        return first.get().toDto();
    }
}
