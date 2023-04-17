package com.example.repository;

import com.example.entity.Cart;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface CartRepository extends CrudRepository<Cart,Integer> { }
