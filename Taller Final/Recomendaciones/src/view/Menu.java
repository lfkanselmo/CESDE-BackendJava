package view;

import entidades.Administrador;
import entidades.Favorito;
import entidades.FavoritoUtil;
import entidades.Lector;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final Scanner read = new Scanner(System.in);
    private ArrayList<Favorito> recomendados = new ArrayList<>();
    private Administrador administrador = new Administrador();
    private Lector lector = new Lector();

    public void iniciarMenu(){
        System.out.println();
        System.out.println("******* BIEVENIDO *******");
        System.out.println();
        boolean run = true;

        do {
            System.out.println("""
                    
                    Seleccione lo que desea hacer:
                    1. Ingresa como Administrador
                    2. Ingresa como Lector
                    3. Salir
                    
                    """);

            String opc = read.nextLine();
            switch (opc){
                case "1":
                    menuAdministrador();
                    run = true;
                    break;

                case "2":
                    menuLector();
                    run = true;
                    break;

                case "3":
                    System.out.println();
                    System.out.println("******* ADIOS *******");
                    System.out.println();
                    run = false;
                    break;

                default:
                    run = true;
                    System.out.println("Elección incorrecta");
                    break;
            }

        }while (run);

    }

    public void menuAdministrador(){
        System.out.println();
        System.out.println("******* BIEVENIDO ADMINISTRADOR *******");
        System.out.println();
        boolean run = true;

        do {
            System.out.println("""
                    
                    Seleccione lo que desea hacer:
                    1. Registrar recomendación
                    2. Mostrar recomendados
                    3. Salir
                    
                    """);

            String opc = read.nextLine();
            switch (opc){
                case "1":
                    registrarRecomendado();
                    run = true;
                    break;

                case "2":
                    mostrarRecomendados();
                    run = true;
                    break;

                case "3":
                    System.out.println();
                    System.out.println("******* ADIOS *******");
                    System.out.println();
                    run = false;
                    break;

                default:
                    run = true;
                    System.out.println("Elección incorrecta");
                    break;
            }

        }while (run);
    }

    public void menuLector(){
        System.out.println();
        System.out.println("******* BIEVENIDO *******");
        System.out.println();
        boolean run = true;

        do {
            System.out.println("""
                    
                    Seleccione lo que desea hacer:
                    1. Dar me gusta a un favorito
                    2. Comentar un favorito
                    3. Mostrar recomendados
                    4. Salir
                    
                    """);

            String opc = read.nextLine();
            switch (opc){

                case "1":
                    darMeGusta();
                    run = true;
                    break;

                case "2":
                    comentar();
                    run = true;
                    break;

                case "3":
                    mostrarRecomendados();
                    run = true;
                    break;

                case "4":
                    System.out.println();
                    System.out.println("******* BIEVENIDO *******");
                    System.out.println();
                    run = false;
                    break;

                default:
                    run = true;
                    System.out.println("Elección incorrecta");
                    break;
            }

        }while (run);
    }

    private void mostrarRecomendados(){
        System.out.println("Los recomendados");
        if (!recomendados.isEmpty()){
            recomendados.forEach((p) -> {
                FavoritoUtil favorito = (FavoritoUtil)(p);
                System.out.println(favorito.toString());
            });
        }else{
            System.out.println("No hay elementos para mostrar");
        }
    }

    private void darMeGusta(){
        lector.darMeGusta(recomendados);
    }

    private void comentar(){
        lector.comentar(recomendados);
    }

    private void registrarRecomendado(){
        administrador.registrar(recomendados);
    }

}
