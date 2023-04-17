package com.example.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "\"order\"")
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue()
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User userid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payid")
    private Pay payid;

    @Size(max = 255)
    @NotNull
    @Column(name = "status", nullable = false)
    private String status;

    @Size(max = 255)
    @Column(name = "comment")
    private String comment;



    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Column(name = "tyoe_of_send")
    private String tyoeOfSend;
    @Size(max = 1024)
    @Column(name = "adress")
    private String Adress;
    @Column(name = "cart_list")
    private String CartList;

    @Column(name = "date_of_order")
    private LocalDate dateOfOrder;
    @Column(name = "date_of_recive")
    private LocalDate dateofrecive;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public String getCartList() {
        return CartList;
    }

    public void setCartList(String cartList) {
        this.CartList = cartList;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public Pay getPayid() {
        return payid;
    }

    public void setPayid(Pay payid) {
        this.payid = payid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTyoeOfSend() {
        return tyoeOfSend;
    }

    public void setTyoeOfSend(String tyoeOfSend) {
        this.tyoeOfSend = tyoeOfSend;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public LocalDate getDateofrecive() {
        return dateofrecive;
    }

    public void setDateofrecive(LocalDate dateofrecive) {
        this.dateofrecive = dateofrecive;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        this.Adress = adress;
    }

}