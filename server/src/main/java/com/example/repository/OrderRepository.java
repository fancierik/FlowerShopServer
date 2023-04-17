package com.example.repository;
import com.example.entity.Order;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer> {
@Override
    List<Order> findAll();

//    List<Order> deleteById();

}

