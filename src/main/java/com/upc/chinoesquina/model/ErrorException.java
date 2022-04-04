package com.upc.chinoesquina.model;

public class ErrorException {
    private String Code;
    private String Description;

    public ErrorException(String code, String description) {
        Code = code;
        Description = description;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
