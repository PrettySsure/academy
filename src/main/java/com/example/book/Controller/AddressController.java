package com.example.book.Controller;

import com.example.book.DTO.AddressDTO;
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
    public Address getAddress(@PathVariable Long addressId) {
        return addressService.getAddressById(addressId);
    }

    @PostMapping("/addresses")
    public AddressDTO createAddress(@RequestBody Address address) {
        AddressDTO response = addressService.createAddress(address);
        return response;
    }

    @DeleteMapping("/addresses/{addressId}")
    public AddressDTO deleteAddress(@PathVariable Long addressId) {
        AddressDTO response = addressService.deleteAddressById(addressId);
        return response ;
    }

}
