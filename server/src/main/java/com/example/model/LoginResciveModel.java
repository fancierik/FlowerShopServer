package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResciveModel {
    private String login;
    private String password;
    private boolean manager;
    public LoginResciveModel(
            @JsonProperty("login") String login,
            @JsonProperty("password") String password,
            @JsonProperty("manager") boolean manager){
        this.login = login;
        this.password = password;
        this.manager = manager;
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

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }
}
