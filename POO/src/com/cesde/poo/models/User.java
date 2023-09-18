package com.cesde.poo.models;

import java.util.Scanner;

public class User {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private String address;

    public User() {

    }

    public User(String id, String name, String email, String phoneNumber, String password, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [" +
                "id = " + getId() + '\n' +
                "Name = " + getName() + '\n' +
                "Email = " + getEmail() + '\n' +
                "PhoneNumber = " + getPhoneNumber() + '\n' +
                "Address = " + getAddress() +
                ']';
    }

}
