package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //    GET /addresses - get all addresses
    @GetMapping("address")
    public Iterable<Address> getAlladdress(){
        return addressService.getAlladdress();
    }


    //    GET /addresses/{id} - get an address by id
    @GetMapping("address/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
    //    POST /addresses - create a new address
    @PostMapping("address")
    public String postAddress(@RequestBody Address address){
        return addressService.postAddress(address);
    }
//    PUT /addresses/{id} - update an address by id

    @PutMapping("address/{id}/{city}")
    public String updateAddress(@PathVariable Long id , @PathVariable String city){
        return addressService.updateAddress(id , city);
    }
//    DELETE /addresses/{id} - delete an address by id

    @DeleteMapping("address/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
