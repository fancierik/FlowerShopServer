package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class UserReciveModel {
    private String name;
    private String secondName;
    private String login;
    private String password;

    private String email;
    public UserReciveModel(@JsonProperty("name")String name,
                           @JsonProperty("secondName")String secondName,
                           @JsonProperty("login")String login,
                           @JsonProperty("password")String password,
                           @JsonProperty("email") String email){
        this.name = name;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
