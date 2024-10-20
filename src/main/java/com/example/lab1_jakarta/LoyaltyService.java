package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface LoyaltyService {
    @WebMethod
    public String addLoyaltyPoints(String clientId, int points);

    @WebMethod
    public String getLoyaltyPoints(String clientId);
}
