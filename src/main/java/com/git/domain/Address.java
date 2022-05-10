package com.git.domain;

import com.git.dto.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String street;
    private String city;
    private User user;

    public Address() {
    }

    public Address(String street, String city, User user) {
        this.street = street;
        this.city = city;
        this.user = user;
    }

    public Address(final AddressDto addressDto) {
        this.street = addressDto.getStreet();
        this.city = addressDto.getCity();
        this.user = addressDto.getUser();
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

    public AddressDto toAddressDto() {
        return new AddressDto(this.street, this.city, this.user);
    }
}
