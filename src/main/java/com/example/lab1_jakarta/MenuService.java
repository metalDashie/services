package com.example.lab1_jakarta;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public interface MenuService {

    @WebMethod
    public String getMenu(String restaurantId);

    @WebMethod
    public String createOrder(String restaurantId, String itemId, int quantity);
}
