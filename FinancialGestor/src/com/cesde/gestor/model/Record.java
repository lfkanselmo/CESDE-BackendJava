package com.cesde.gestor.model;

import java.util.Scanner;

public class Record {
    private Double salary;
    private Double incomings;
    private Double egress;
    private Double saves;
    private User profile;

    static final Scanner read = new Scanner(System.in);


    @Override
    public String toString() {
        return "Registro [" +
                "Salario = " + salary + "\n" +
                " Rentas = " + incomings + "\n" +
                " Gastos = " + egress + "\n" +
                " Ahorros = " + saves + "\n" + "\n" +
                "---> Perfil = " + profile +
                ']';
    }

    public void dataRecord(){
        profile = new User();
        profile.userCreate();
        System.out.println();
        System.out.println("Ingrese el salario del usuario " + profile.getName().toUpperCase());
        this.salary = read.nextDouble();
        System.out.println("Ingrese las rentas del usuario " + profile.getName().toUpperCase());
        this.incomings = read.nextDouble();
        System.out.println("Ingrese los egresos del usuario " + profile.getName().toUpperCase());
        this.egress = read.nextDouble();
        System.out.println("Ingrese los ahorros del usuario " + profile.getName().toUpperCase());
        this.saves = read.nextDouble();
    }
}
