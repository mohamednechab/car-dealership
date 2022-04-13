package com.m2i.cardealership.repository;

import com.m2i.cardealership.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserByLoginAndPassword(String login, String password);
    void deleteUserByLogin(String login);
}
