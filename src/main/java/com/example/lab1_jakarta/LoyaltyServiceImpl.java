package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class LoyaltyServiceImpl implements LoyaltyService {
    @WebMethod
    public String addLoyaltyPoints(String clientId, int points) {
        return "Додано " + points + " бонусних балів для клієнта " + clientId;
    }

    @WebMethod
    public String getLoyaltyPoints(String clientId) {
        return "Баланс бонусних балів для клієнта " + clientId + ": 200 балів.";
    }
}
