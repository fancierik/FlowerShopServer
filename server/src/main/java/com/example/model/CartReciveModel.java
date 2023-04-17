package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartReciveModel {
    private String name;
    private int price;
//    private int kol;
    public CartReciveModel(@JsonProperty("name") String name,
                           @JsonProperty("price") int price
//                           @JsonProperty("kol") int kol
    ){
        this.name = name;
        this.price = price;
//        this.kol=kol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public int getKol() {
//        return kol;
//    }
//
//    public void setKol(int kol) {
//        this.kol = kol;
//    }
}
