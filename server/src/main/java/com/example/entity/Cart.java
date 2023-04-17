package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue()
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idorder")
    private Order idorder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idgod")
    private Good idgod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getIdorder() {
        return idorder;
    }

    public void setIdorder(Order idorder) {
        this.idorder = idorder;
    }

    public Good getIdgod() {
        return idgod;
    }

    public void setIdgod(Good idgod) {
        this.idgod = idgod;
    }

}