package com.git.controller;

import com.git.dto.AddressDto;
import com.git.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/getAddresses")
    public List<AddressDto> getAddresses() {
        return addressService.getAddresses();
    }
}
