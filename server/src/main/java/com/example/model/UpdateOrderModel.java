package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class UpdateOrderModel {
    private String status;
    private String id;
    private String dateofRecive;
    public UpdateOrderModel(@JsonProperty("status")String status,
                            @JsonProperty("id") String id,
                            @JsonProperty("dateOfRecive") String dateofRecive){
        this.dateofRecive = dateofRecive;
        this.id = id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return Integer.parseInt(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateofRecive() {
        return dateofRecive;
    }

    public void setDateofRecive(String dateofRecive) {
        this.dateofRecive = dateofRecive;
    }
}
