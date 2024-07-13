package com.gibson.entity;

public class User extends Admin{
    private String nama;
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
