package com.example.dao;


import com.example.entity.User;
import com.example.repository.UserRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class UserDTO {
    @Inject
    UserRepository userRepository ;
    @Inject
    LoginDTO loginDTO;

    public List<User> GetAllUser(){
        return userRepository.findAll();
    }
}
