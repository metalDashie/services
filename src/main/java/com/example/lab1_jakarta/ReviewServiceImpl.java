package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ReviewServiceImpl implements ReviewService {
    @WebMethod
    public String submitReview(String restaurantId, String review, int rating) {
        return "Відгук для ресторану " + restaurantId + " з оцінкою " + rating + " додано.";
    }

    @WebMethod
    public String getReviews(String restaurantId) {
        return "Відгуки для ресторану " + restaurantId + ": [Дуже смачно! - 5 зірок, Гарне обслуговування - 4 зірки]";
    }
}
