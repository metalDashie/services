package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface BookingService {
    @WebMethod
    public String createBooking(String restaurantId, String date, String time, int guests);

    @WebMethod
    public String cancelBooking(String bookingId);

    @WebMethod
    public String getBookingDetails(String bookingId);
}