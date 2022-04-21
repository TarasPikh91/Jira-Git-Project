package com.git.controller;

import com.git.dto.AddressDto;
import com.git.service.AddressService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    final private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/saveAddress")
    public String saveAddress(@RequestBody AddressDto addressDto) {
        addressService.saveAddress(addressDto);
        return "true";
    }
}
