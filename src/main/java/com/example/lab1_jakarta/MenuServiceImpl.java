package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class MenuServiceImpl implements MenuService {
    @WebMethod
    public String getMenu(String restaurantId) {
        return "Меню для ресторану " + restaurantId + ": Салат Цезар, Паста Карбонара, Суші сет.";
    }

    @WebMethod
    public String createOrder(String restaurantId, String itemId, int quantity) {
        String orderId = "ORD" + Math.random();
        return "Замовлення створено: ID - " + orderId + ", Ресторан - " + restaurantId + ", Товар - " + itemId + ", Кількість - " + quantity;
    }
}
