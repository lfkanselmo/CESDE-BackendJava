package principios_poo;

import java.util.Scanner;

public class Padre extends Familia{

    private static final Scanner read = new Scanner(System.in);

    private String profesion;

    public Padre(String apellidoPadre){
        this.apellidoPadre = apellidoPadre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void crearPadre(){
        System.out.println("De un ID al padre: ");
        this.idPadre = read.nextInt();
        System.out.println("De un edad al padre: ");
        this.edadPadre = read.nextInt();
        read.skip("\n");
        System.out.println("De un nombre al padre: ");
        this.nombrePadre = read.next();
        System.out.println("De un apellido al padre: ");
        this.apellidoPadre = read.next();
    }

    public void mostrarNombre(){
        System.out.println(this.nombrePadre);
    }
}
