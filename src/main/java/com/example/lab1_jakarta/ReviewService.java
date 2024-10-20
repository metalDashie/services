package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ReviewService {
    @WebMethod
    public String submitReview(String restaurantId, String review, int rating);

    @WebMethod
    public String getReviews(String restaurantId);
}
