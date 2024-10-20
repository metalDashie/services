package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class BookingServiceImpl implements BookingService {
    @WebMethod
    public String createBooking(String restaurantId, String date, String time, int guests) {
        String bookingId = "BOOK" + Math.random();
        return "Бронювання створено: ID - " + bookingId + ", Ресторан - " + restaurantId + ", Дата - " + date + ", Час - " + time + ", Кількість гостей - " + guests;
    }

    @WebMethod
    public String cancelBooking(String bookingId) {
        return "Бронювання з ID " + bookingId + " скасовано.";
    }

    @WebMethod
    public String getBookingDetails(String bookingId) {
        return "Деталі бронювання для ID " + bookingId;
    }
}