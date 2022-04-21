package com.git.db;

import com.git.domain.Address;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressContainer {

    private List<Address> addressList;

    public void addAddress() {
        if (addressList == null) {
            addressList = new ArrayList<>();
        }
        addressList.add(new Address());
    }


}
