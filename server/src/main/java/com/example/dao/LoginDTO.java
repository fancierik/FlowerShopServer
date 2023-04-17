package com.example.dao;

import com.example.entity.Managerlist;
import com.example.entity.User;
import com.example.repository.ManagerListRepository;
import com.example.repository.UserRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.time.LocalDate;

@Singleton
public class LoginDTO {
    @Inject
    UserRepository userRepository;
    @Inject
    ManagerListRepository managerlist;

    public int confirmLoginPass(String login, String password, boolean manager) {
        int reqest = 0;
        if (!manager) {
            if (!userRepository.getByLoginAndPassword(login, password).getPassword().isEmpty()) {
                reqest = 1;
            } else {
                reqest = 0;
            }
        } else {
            if (!userRepository.getByLoginAndPassword(login, password).getPassword().isEmpty() & managerlist.findByManagerid(userRepository.getByLoginAndPassword(login, password)) != null) {
                reqest = 2;
            } else {
                reqest = 0;
            }
        }
        return reqest;
    }

    public User getUser(String login, String password) {
        return userRepository.getByLoginAndPassword(login, password);
    }

    public boolean newUser(String name, String secondName, String login, String password, String email) {

        if (name == null || email == null) {
            return false;
        }
        User user = new User();
        user.setName(name);
        user.setSecondname(secondName);
        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);

        userRepository.save(user);
        return true;
    }
}
