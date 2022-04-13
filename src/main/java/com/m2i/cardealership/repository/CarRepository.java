package com.m2i.cardealership.repository;

import com.m2i.cardealership.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
    Iterable<Car> findByForSaleTrueAndPlaceStoreManagerLogin(String login);
}
