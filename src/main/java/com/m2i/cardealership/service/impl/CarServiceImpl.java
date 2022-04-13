package com.m2i.cardealership.service.impl;

import com.m2i.cardealership.entity.Car;
import com.m2i.cardealership.repository.CarRepository;
import com.m2i.cardealership.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car findCarById(int carId) {
        return carRepository.findById(carId).orElse(null);
    }

    @Override
    public Iterable<Car> getAllCarsForSale(String commercialLogin) {
        return carRepository.findByForSaleTrueAndPlaceStoreManagerLogin(commercialLogin);
    }
}
