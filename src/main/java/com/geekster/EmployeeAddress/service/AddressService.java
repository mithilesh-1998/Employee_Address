package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
    public Iterable<Address> getAlladdress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findAddressById(id);
    }

    public String postAddress(Address address) {
        addressRepo.save(address);
        return "address added";
    }

    public String deleteAddress(Long id) {
        addressRepo.deleteById(id);
        return "Deleted";
    }

    public String updateAddress(Long id, String city) {
        Optional<Address> myAddress= addressRepo.findById(id);
        Address add=null;
        if(myAddress.isPresent()){
            add=myAddress.get();
        }else{
            return "ID NOT FOUND";
        }
        add.setCity(city);
        addressRepo.save(add);
        return "Address Updated";

    }
}
