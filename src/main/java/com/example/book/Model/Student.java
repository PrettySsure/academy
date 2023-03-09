package com.example.book.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
