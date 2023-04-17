package com.example.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pay")
public class Pay {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue()
    private Integer id;

    @Column(name = "summ")
    private Double summ;

    @Column(name = "date_of_pay")
    private LocalDate dateOfPay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSumm() {
        return summ;
    }

    public void setSumm(Double summ) {
        this.summ = summ;
    }

    public LocalDate getDateOfPay() {
        return dateOfPay;
    }

    public void setDateOfPay(LocalDate dateOfPay) {
        this.dateOfPay = dateOfPay;
    }

}