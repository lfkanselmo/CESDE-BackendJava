package com.cesde.poo.services;

import com.cesde.poo.dao.UserDao;
import com.cesde.poo.models.User;

import java.util.List;
import java.util.Scanner;

public class UserService {

    final Scanner read = new Scanner(System.in);
    private User user;
    private List<User> users;
    private UserDao userDao = new UserDao(users);

    public UserService(List<User> users) {
        this.users = users;
    }

    //Register function
    public void singUp(){
        user = new User();
        System.out.println();
        System.out.println("****** NUEVO USUARIO ******");
        System.out.println();
        System.out.println("Ingrese su ID: ");
        user.setId(read.nextInt());
        read.skip("\n");
        if (userDao.searchUser(user.getId())){
            System.out.println("Usuario ya se encuentra registrado");
        } else{
            System.out.println("Ingrese su nombre: ");
            user.setName(read.nextLine());
            System.out.println("Ingrese su email: ");
            user.setEmail(read.nextLine());
            System.out.println("Ingrese su número de teléfono: ");
            user.setPhoneNumber(read.nextLine());
            System.out.println("Ingrese su dirección: ");
            user.setAddress(read.nextLine());
            System.out.println("Ingrese su contraseña: ");
            user.setPassword(read.nextLine());

            userDao.addUser(user);
        }
    }

    //login function
    public boolean logIn(){
        boolean log = false;
        System.out.println();
        System.out.println("****** INICIO DE SESIÓN");
        System.out.println();
        System.out.println("Ingrese el correo registrado");
        String emailRegisted = read.nextLine();
        System.out.println("Ingrese la contraseña");
        String passwordRegisted = read.nextLine();

        if (user.getEmail().equals(emailRegisted) && user.getPassword().equals(passwordRegisted)){
            System.out.println("Bienvenido " + user.getName());
            log = true;
        } else {
            System.out.println("Credenciales incorrectas, no se puede iniciar sesión");
        }

        return log;
    }
}
