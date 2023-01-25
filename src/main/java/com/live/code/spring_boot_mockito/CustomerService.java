package com.live.code.spring_boot_mockito;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer getCustomer(String id){
        return Customer.builder().id(id).name("Customer " + id).build();
    }
}
