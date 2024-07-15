package com.gibson.entity;

import com.gibson.anotation.IsBlankAnotation;

public class User extends Admin{
    @IsBlankAnotation
    private String nama;
    @IsBlankAnotation
    private String email;

    public User(String userName, String password) {
        super(userName, password);
    }

    public User(String userName, String password, String nama, String email) {
        super(userName, password);
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
