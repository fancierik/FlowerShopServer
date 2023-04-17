package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
//десериализация
public class CartReciveModel2 {
    private String status;
    private String LoginField;
    private String PasswordField;
    private String AdressField;
    private String DateOrder;
    private Integer summ;
    private String email;
    private List<CartReciveModel> CartList;
    private String namee;
    public CartReciveModel2(@JsonProperty("status") String status,
                            @JsonProperty("LoginField") String LoginField,
                            @JsonProperty("AdressField") String AdressField,
                            @JsonProperty("DateOrder") String DateOrder,
                            @JsonProperty("data") List<CartReciveModel> CartList,
                            @JsonProperty("PasswordField") String PasswordField,
                            @JsonProperty("summ") Integer summ,
                            @JsonProperty("email") String email,
                            @JsonProperty("namee") String namee) {
        this.namee = namee;
        this.AdressField = AdressField;
        this.CartList = CartList;
        this.LoginField = LoginField;
        this.status = status;
        this.DateOrder = DateOrder;
        this.PasswordField = PasswordField;
        this.summ = summ;
        this.email = email;
    }

    public String getNamee() {return namee;}

    public void setNamee(String name) {this.namee = namee;}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoginField() {
        return LoginField;
    }

    public void setLoginField(String loginField) {
        LoginField = loginField;
    }

    public String getPasswordField() {
        return PasswordField;
    }

    public void setPasswordField(String passwordField) {
        PasswordField = passwordField;
    }

    public String getAdressField() {
        return AdressField;
    }

    public void setAdressField(String adressField) {
        AdressField = adressField;
    }

    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String dateOrder) {
        DateOrder = dateOrder;
    }

    public List<CartReciveModel> getCartList() {
        return CartList;
    }

    public void setCartList(List<CartReciveModel> cartList) {
        CartList = cartList;
    }

    public Integer getSumm() {
        return summ;
    }

    public void setSumm(Integer summ) {
        this.summ = summ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
