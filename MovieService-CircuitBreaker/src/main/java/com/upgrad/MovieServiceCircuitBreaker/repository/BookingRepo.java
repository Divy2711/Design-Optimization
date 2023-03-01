package com.upgrad.MovieServiceCircuitBreaker.repository;

import com.upgrad.MovieServiceCircuitBreaker.model.Booking;

import java.util.List;

public interface BookingRepo {
        Booking getBookingDetails(int bookingId);
        List<Booking> getAllBookings();
        Booking saveBookingDetails(Booking booking);
}
