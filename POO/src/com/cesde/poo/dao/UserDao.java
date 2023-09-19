package com.cesde.poo.dao;

import com.cesde.poo.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDao {
    private final List<User> users = new ArrayList<>();

    public UserDao(){
    }

    public void addUser(User user){
        users.add(user);
    }

    public User searchUser(String email){
        boolean exist = false;
        User userAux = null;

        if (!users.isEmpty()){
            for (User aux: users) {
                if (aux.getEmail().equals(email)){
                    exist = true;
                    userAux = aux;
                    break;
                }
            }
        }

        return userAux;
    }

    public void deleteUser(){
        throw new RuntimeException();
    }

    public void updateUser(){
        throw new RuntimeException();
    }



}
