package com.example.book.Service;

import com.example.book.Model.Address;
import com.example.book.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
        Optional<Address> addressOptional = addressRepository.findById(id);
        return addressOptional.get();
    }

    @Override
    public void createAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void deleteAddressById(Long id) {
        addressRepository.deleteById(id);
    }
    }

