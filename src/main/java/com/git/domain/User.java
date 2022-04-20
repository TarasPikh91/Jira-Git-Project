package com.git.domain;

import com.git.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String username;
    private String password;
    private Integer age;

    public User() {
    }

    public User(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User(final UserDto userDto) {
        this.username = userDto.getUsername();
        this.password = userDto.getPassword();
        this.age = userDto.getAge();
    }

    public UserDto toDto() {
        return new UserDto(this.username, this.password, this.age);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
