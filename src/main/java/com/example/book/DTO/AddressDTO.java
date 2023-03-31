package com.example.book.DTO;

import lombok.Data;

@Data
public class AddressDTO {
    private String addressNumber;
    private String street;
    private String ward;
    private String fullAddress;
}
