package com.example.book.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "students")
public class Student {
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name= "first_name")
    private String firstName;
    @Column(name= "last_name")
    private String lastName;
    @Column(name= "age")
    private Integer age;
}
