package com.cesde.poo.test;

import com.cesde.poo.services.UserService;

public class Test {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.singUp();
        userService.singUp();
        if (userService.logIn()) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
    }
}
