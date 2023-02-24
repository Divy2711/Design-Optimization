package com.upgrad.CacheDemo.repository;

import com.upgrad.CacheDemo.entity.Address;
import com.upgrad.CacheDemo.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer getCustomerDetails(int customerId);
    List<Customer> getAllCustomer();
    Customer saveCustomerDetails(Customer customer);
    List<Address> getAllCustomerAddress();
    Address getCustomerAddress(int customerId);
}
