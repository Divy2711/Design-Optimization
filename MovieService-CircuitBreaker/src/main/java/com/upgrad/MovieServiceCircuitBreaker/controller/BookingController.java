package com.upgrad.MovieServiceCircuitBreaker.controller;

import com.upgrad.MovieServiceCircuitBreaker.model.Booking;
import com.upgrad.MovieServiceCircuitBreaker.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking")
    public ResponseEntity getAllBooking(){
        List<Booking> booking = bookingService.getAllBooking();
        return ResponseEntity.ok(booking);
    }

    @PostMapping("/booking")
    public ResponseEntity acceptBooking(@RequestBody Booking booking){
        String bookingMsg = bookingService.saveBookingDetails(booking);
        return ResponseEntity.ok(bookingMsg);
    }

    @GetMapping("/booking/{id}")
    public ResponseEntity getBookingDetails(@PathVariable("id") int bookingId){
        Booking booking = bookingService.getBookingDetails(bookingId);
        return ResponseEntity.ok(booking);
    }

}
