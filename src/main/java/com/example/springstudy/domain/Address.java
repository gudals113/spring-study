package com.example.springstudy.domain;

import jakarta.persistence.Entity;

@Entity
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
