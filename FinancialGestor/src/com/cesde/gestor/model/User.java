package com.cesde.gestor.model;

import java.util.Scanner;

public class User {
    private String name;
    private String lastname;
    private String email;

    static final Scanner read = new Scanner(System.in);

    public User() {
    }

    @Override
    public String toString() {
        return "Usuario [" +
                "Nombre = '" + name +
                ", Apellido = '" + lastname +
                ", Email = '" + email +
                ']';
    }

    public String getName() {
        return name;
    }

    public void userCreate(){
        System.out.println();
        System.out.println("Ingrese el nombre del usuario");
        this.name = read.next();
        System.out.println("Ingrese el apellido del usuario");
        this.lastname = read.next();
        System.out.println("Ingrese el email del usuario");
        this.email = read.next();
    }
}
