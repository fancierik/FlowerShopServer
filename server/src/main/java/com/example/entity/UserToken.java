package com.example.entity;

public class UserToken {
    private String userLogin;
    private String userToken;
    public UserToken(String userLogin,String userToken){
        this.userLogin = userLogin;
        this.userToken = userToken;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
