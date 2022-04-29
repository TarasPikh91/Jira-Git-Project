package com.git.domain;

import com.git.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {

    private String username;
    private String password;
    private Integer age;
    private List<Address> addresses;
    private String email;

    public User() {
    }

    public User(String username, String password, Integer age, List<Address> addresses) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.addresses = addresses;
    }

    public User(final UserDto userDto) {
        this.username = userDto.getUsername();
        this.password = userDto.getPassword();
        this.age = userDto.getAge();
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
