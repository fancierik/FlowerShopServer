package com.example.repository;

import com.example.entity.Managerlist;
import com.example.entity.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ManagerListRepository extends CrudRepository<Managerlist,Integer> {
    Managerlist findByManagerid(User user);
}
