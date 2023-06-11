package com.example.book.Service;

import com.example.book.DTO.AddressDTO;
import com.example.book.Model.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();
    public Address getAddressById(Long id);
    public AddressDTO createAddress(Address address);
    public AddressDTO deleteAddressById(Long id);
}
