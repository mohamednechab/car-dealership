package com.m2i.cardealership.repository;

import com.m2i.cardealership.entity.Car;
import com.m2i.cardealership.entity.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<Sale, Integer> {
}
