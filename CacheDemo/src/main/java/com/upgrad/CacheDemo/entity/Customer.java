package com.upgrad.CacheDemo.entity;

import lombok.Data;

@Data
public class Customer {
    private int customerId;
    private String customerName;
    private int customerAge;
    private Address customerAddress;

    public Customer(int customerId, String customerName, int customerAge, String streetName, String cityName, int pinCode) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerAddress = new Address(streetName,cityName,pinCode);
    }
}
