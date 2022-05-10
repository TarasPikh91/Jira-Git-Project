package com.git.db;

import com.git.domain.Address;
import com.git.dto.AddressDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressContainer {

    private List<Address> addressList;

    public void addAddress(final AddressDto addressDto) {
        if (addressList == null) {
            addressList = new ArrayList<>();
        }
        addressList.add(new Address(addressDto));
    }


    public List<AddressDto> getAddresses() {
        if (this.addressList == null) {
            return new ArrayList<>();
        }
        return this.addressList.stream().map(it -> it.toAddressDto()).collect(Collectors.toList());
    }
}
