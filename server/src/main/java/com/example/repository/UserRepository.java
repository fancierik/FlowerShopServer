package com.example.repository;

import com.example.entity.Order;
import com.example.entity.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    User getByLoginAndPassword(String login, String password);
    User getById(Integer id);
    List<User> findAll();
}
