package com.upgrad.CacheDemo.entity;

import lombok.Data;

@Data
public class Address {
    private String streetName;
    private String cityName;
    private int pinCode;

    public Address(String streetName, String cityName, int pinCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.pinCode = pinCode;
    }

    public String getAddressDetails() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
