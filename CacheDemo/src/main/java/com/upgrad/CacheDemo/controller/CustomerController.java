package com.upgrad.CacheDemo.controller;

import com.upgrad.CacheDemo.entity.Address;
import com.upgrad.CacheDemo.entity.Customer;
import com.upgrad.CacheDemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public ResponseEntity getAllCustomers(){
        List<Customer> customers = customerService.getAllCustomer();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/address")
    public ResponseEntity getAllCustomerAddress(){
        List<Address> addresses = customerService.getAllCustomerAddress();
        return ResponseEntity.ok(addresses);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity getCustomerDetails(@PathVariable("id") int customerId){
        Customer customer = customerService.getCustomerDetails(customerId);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/address/{id}")
    public ResponseEntity getAddressDetails(@PathVariable("id") int customerId){
        Address address = customerService.getCustomerAddress(customerId);
        return ResponseEntity.ok(address);
    }

    @PostMapping("/customer")
    public ResponseEntity acceptCustomerDetails(@RequestBody Customer customer){
        Customer savedCustomer = customerService.saveCustomerDetails(customer);
        return ResponseEntity.ok(savedCustomer);
    }
}
