package com.upgrad.MovieServiceCircuitBreaker.service;

import com.upgrad.MovieServiceCircuitBreaker.model.Booking;

import java.util.List;

public interface BookingService {
    Booking getBookingDetails(int bookingId);
    List<Booking> getAllBooking();
    String saveBookingDetails(Booking booking);

}
