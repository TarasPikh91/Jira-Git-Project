package com.git.service;

import com.git.db.AddressContainer;
import com.git.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressContainer addressContainer;

    public AddressService(AddressContainer addressContainer) {
        this.addressContainer = addressContainer;
    }

    public void saveAddress(final AddressDto addressDto) {
        addressContainer.addAddress(addressDto);
    }

    public List<AddressDto> getAddresses() {
        return addressContainer.getAddresses();
    }
}
