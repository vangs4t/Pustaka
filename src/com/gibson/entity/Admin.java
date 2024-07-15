package com.gibson.entity;

import com.gibson.anotation.IsBlankAnotation;

public class Admin {
    @IsBlankAnotation
    private String userName;
    @IsBlankAnotation
    private String password;

    public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
