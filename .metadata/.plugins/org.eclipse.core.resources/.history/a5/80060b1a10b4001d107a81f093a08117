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
        simulateSlowService();
        return customerRepository.getCustomerDetails(customerId);
    }

    @Override
    public List<Customer> getAllCustomer() {
        simulateSlowService();
        return customerRepository.getAllCustomer();
    }

    @Override
    public Customer saveCustomerDetails(Customer customer) {
        return customerRepository.saveCustomerDetails(customer);
    }

    @Override
    public List<Address> getAllCustomerAddress() {
        simulateSlowService();
        return customerRepository.getAllCustomerAddress();
    }

    @Override
    public Address getCustomerAddress(int customerId) {
        simulateSlowService();
        return customerRepository.getCustomerAddress(customerId);
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

