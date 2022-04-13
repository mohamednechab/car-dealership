package com.m2i.cardealership.service;

import com.m2i.cardealership.entity.Car;
import org.springframework.stereotype.Service;

public interface ICarService {
    Car findCarById(int carId);
    Iterable<Car> getAllCarsForSale(String commercialLogin);
}
