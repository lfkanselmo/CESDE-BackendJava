package com.cesde.poo.dao;

import com.cesde.poo.models.User;

import java.util.List;

public class UserDao {

    private List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public boolean searchUser(Integer id){
        boolean exist = false;

        for (User aux: users) {
            if (aux.getId() == id){
                exist = true;
                break;
            }
        }

        return exist;
    }

}
