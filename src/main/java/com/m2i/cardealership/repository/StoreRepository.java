package com.m2i.cardealership.repository;

import com.m2i.cardealership.entity.Place;
import com.m2i.cardealership.entity.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Integer> {
}
