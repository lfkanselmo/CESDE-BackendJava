package principios_poo;

import java.util.Scanner;

public abstract class Familia {
    private static final Scanner read = new Scanner(System.in);
    protected int idPadre;
    protected String nombrePadre;
    protected  String apellidoPadre;
    protected int edadPadre;


    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
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

    public abstract void mostrarNombre();

}
