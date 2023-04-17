package com.example.model;


import com.fasterxml.jackson.annotation.JsonProperty;


//обычный класс но с аннотациями для сериализации json
//формат данных - json
//отвечате за правильную отрпавку - принятие данных
public class GodModel {
    private Integer id;
    private String description;
    private Double price;
    private String name;

    public GodModel(@JsonProperty("id") Integer id,
                    @JsonProperty("description") String description,
                    @JsonProperty("price") Double price,
                    @JsonProperty("name") String name) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String descriptions) {
        this.description = descriptions;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

}
