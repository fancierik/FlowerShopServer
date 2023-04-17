package com.example.repository;


import com.example.entity.Good;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface GodRepository extends CrudRepository<Good,Integer> {

    @Override
    List<Good> findAll();
    Good findByDescription(String description);


}
