package com.cesde.poo.main;

import com.cesde.poo.models.User;
import com.cesde.poo.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        UserService userService = new UserService(users);

        userService.singUp();
        userService.singUp();
    }
}
