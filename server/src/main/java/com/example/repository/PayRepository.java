package com.example.repository;

import com.example.entity.Order;
import com.example.entity.Pay;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PayRepository extends CrudRepository<Pay,Integer> {
}
