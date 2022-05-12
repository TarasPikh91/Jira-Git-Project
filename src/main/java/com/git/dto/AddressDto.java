package com.git.dto;

import com.git.domain.User;

public class AddressDto {

    private String street;
    private String city;
    private User user;

    public AddressDto() {
    }

    public AddressDto(String street, String city, User user) {
        this.street = street;
        this.city = city;
        this.user = user;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
