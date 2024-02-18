package com.example.Hadid_Demo.domain;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    public List<Customer> getCustomers(){
        return List.of(
                new Customer(1L,
                        "John",
                        "Doe",
                        "johndoe123@gmail.com",
                        "1234567890"));
    }
}
