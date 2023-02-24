package com.upgrad.CacheDemo.service;

import com.upgrad.CacheDemo.entity.Address;
import com.upgrad.CacheDemo.entity.Customer;
import com.upgrad.CacheDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomerDetails(int customerId) {
        return customerRepository.getCustomerDetails(customerId);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public Customer saveCustomerDetails(Customer customer) {
        return customerRepository.saveCustomerDetails(customer);
    }

    @Override
    public List<Address> getAllCustomerAddress() {
        return customerRepository.getAllCustomerAddress();
    }

    @Override
    public Address getCustomerAddress(int customerId) {
        return customerRepository.getCustomerAddress(customerId);
    }

  
}

