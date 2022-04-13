package com.m2i.cardealership.repository;

import com.m2i.cardealership.entity.Role;
import com.m2i.cardealership.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
