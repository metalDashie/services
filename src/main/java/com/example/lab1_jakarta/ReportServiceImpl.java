package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ReportServiceImpl implements ReportService {
    @WebMethod
    public String generateSalesReport(String restaurantId, String startDate, String endDate) {
        return "Звіт про продажі для ресторану " + restaurantId + " з " + startDate + " до " + endDate;
    }

    @WebMethod
    public String getPopularItems(String restaurantId) {
        return "Популярні страви для ресторану " + restaurantId + ": Суші сет, Паста Карбонара.";
    }
}
