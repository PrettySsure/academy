package com.example.book.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "addresses")
public class Address {
    @Id
    @Column(name= "id")
    @GeneratedValue
    private Long id;
    @Column(name= "address_number")
    private String addressNumber;
    @Column(name= "street")
    private String street;
    @Column(name= "ward")
    private String ward;
    @Column(name= "district")
    private String district;
}
