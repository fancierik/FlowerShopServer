package com.example.model;

public class BasicRequestModel {
    private int code;
    private String message;
    public BasicRequestModel(int code,String message){
        this.code=code;
        this.message = message;
    }
    public BasicRequestModel(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
