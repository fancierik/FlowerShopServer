package com.example.model;

import java.time.LocalDate;
// сериализация
public class SendAllOrderModel {
    private Integer numberofOrder;
    private Integer numberofPay;
    private LocalDate dateofOrder;
    private LocalDate dateofArrive;
    private String fio;
    private String comment;
    private String statuss;
    private String CartList;
    private String adress;
    private String namee;
    public SendAllOrderModel(
            Integer numberofOrder,
            Integer numberofPay,
            LocalDate dateofOrder,
            LocalDate dateofArrive,
            String fio,
            String comment,
            String status,
            String CartList,
            String adress,
            String namee) {
        this.numberofOrder = numberofOrder;
        this.dateofOrder = dateofOrder;
        this.fio = fio;
        this.numberofPay = numberofPay;
        this.dateofArrive = dateofArrive;
        this.comment = comment;
        this.statuss = status;
        this.CartList = CartList;
        this.adress=adress;
        this.namee=namee;
    }
    public String getNamee() {return namee;}

    public void setNamee(String name) {this.namee = name;}
    public String getAdress() {return adress;}

    public void setAdress(String adress) {this.adress = adress;}
    public Integer getNumberofOrder() {
        return numberofOrder;
    }

    public void setNumberofOrder(Integer numberofOrder) {
        this.numberofOrder = numberofOrder;
    }

    public Integer getNumberofPay() {
        return numberofPay;
    }

    public void setNumberofPay(Integer numberofPay) {
        this.numberofPay = numberofPay;
    }

    public LocalDate getDateofOrder() {
        return dateofOrder;
    }

    public void setDateofOrder(LocalDate dateofOrder) {
        this.dateofOrder = dateofOrder;
    }

    public LocalDate getDateofArrive() {
        return dateofArrive;
    }

    public void setDateofArrive(LocalDate dateofArrive) {
        this.dateofArrive = dateofArrive;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return statuss;
    }

    public void setStatus(String status) {
        this.statuss = status;
    }


    public String getCartList() {
        return CartList;
    }

    public void setCartList(String cartList) {
        this.CartList = cartList;
    }
}
