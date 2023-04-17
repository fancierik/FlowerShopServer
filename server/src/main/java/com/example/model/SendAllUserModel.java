package com.example.model;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class SendAllUserModel {
    private Integer numberofUser;
    private String name;
    private String secondname;
    private String login;
    private String email;
    public SendAllUserModel(Integer numberofUser,
                            String name,
                            String secondname,
                            String login,
                            String email) {
        this.numberofUser = numberofUser;
        this.name = name;
        this.secondname = secondname;
        this.login = login;
        this.email = email;
    }
    public Integer getNumberofUser() {
        return numberofUser;
    }

    public void setNumberofUser(Integer numberofUser) {
        this.numberofUser = numberofUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
