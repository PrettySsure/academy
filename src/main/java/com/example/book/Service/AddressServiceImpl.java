package com.example.book.Service;

import com.example.book.DTO.AddressDTO;
import com.example.book.DTO.StudentDTO;
import com.example.book.Model.Address;
import com.example.book.Model.Student;
import com.example.book.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

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
    public AddressDTO createAddress(Address address) {
        AddressDTO response = new AddressDTO();
        Address createdAddress = addressRepository.save(address);
        response.setFullAddress(createdAddress.getAddressNumber() + " " + createdAddress.getStreet() + " " + createdAddress.getWard());
        response.setAddressNumber(createdAddress.getAddressNumber());
        response.setStreet(createdAddress.getStreet());
        response.setWard(createdAddress.getWard());
        return response;
    }

    @Override
    public AddressDTO deleteAddressById(Long id) {
        AddressDTO addressDTO = new AddressDTO();
        Address deletedAddress = addressRepository.findById(id).get();
        addressRepository.deleteById(id);
        addressDTO.setFullAddress(deletedAddress.getAddressNumber() + " " + deletedAddress.getStreet() + " " + deletedAddress.getWard());
        addressDTO.setAddressNumber(deletedAddress.getAddressNumber());
        addressDTO.setStreet(deletedAddress.getStreet());
        addressDTO.setWard(deletedAddress.getWard());
        return addressDTO;
    }
}


