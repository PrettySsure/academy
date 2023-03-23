package com.example.book.Controller;

import com.example.book.Model.Address;
import com.example.book.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public List<Address> getAllAddresses() {
        return addressService.getAll();
    }

    @GetMapping("/addresses/{addressId}")
    public Address getAddress(@PathVariable Long AddressId) {
        return addressService.getAddressById(AddressId);
    }

    @PostMapping("/addresses")
    public String createAddress(@RequestBody Address address) {
        addressService.createAddress(address);
        return "address created";
    }

    @DeleteMapping("/addresses/{addressId}")
    public String deletAddress(@PathVariable Long AddressId) {
        addressService.deleteAddressById(AddressId);
        return "address deleted";
    }

}
