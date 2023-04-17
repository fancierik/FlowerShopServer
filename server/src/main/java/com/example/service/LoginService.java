package com.example.service;

import com.example.dao.LoginDTO;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.time.LocalDate;

@Singleton
public class LoginService {
    @Inject
    LoginDTO loginDTO;
    public int checkLogin(String login,String password,boolean manager){
        return loginDTO.confirmLoginPass(login,password,manager);
    }
}
