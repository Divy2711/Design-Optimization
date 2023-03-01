package com.upgrad.MovieServiceCircuitBreaker.model;

import lombok.Data;

@Data
public class Booking {
    private int bookingId;
    private String movieName;
    private int customerId;
    private int numberOfTickets;

    public Booking(int bookingId, String movieName, int customerId, int numberOfTickets) {
        this.bookingId = bookingId;
        this.movieName = movieName;
        this.customerId = customerId;
        this.numberOfTickets = numberOfTickets;
    }
}
