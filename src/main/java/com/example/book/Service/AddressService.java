package com.example.book.Service;

import com.example.book.Model.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();
    public Address getAddressById(Long id);
    public void createAddress(Address address);
    public void deleteAddressById(Long id);
}
