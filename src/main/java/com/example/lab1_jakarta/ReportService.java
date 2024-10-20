package com.example.lab1_jakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ReportService {
    @WebMethod
    public String generateSalesReport(String restaurantId, String startDate, String endDate);

    @WebMethod
    public String getPopularItems(String restaurantId);
}
