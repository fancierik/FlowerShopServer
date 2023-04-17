package com.example.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "managerlist")
public class Managerlist {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue()
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managerid")
    private User managerid;

    @Size(max = 255)
    @Column(name = "status")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getManagerid() {
        return managerid;
    }

    public void setManagerid(User managerid) {
        this.managerid = managerid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}