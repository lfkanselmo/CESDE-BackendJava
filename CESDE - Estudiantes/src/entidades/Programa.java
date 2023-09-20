package entidades;

import java.util.Scanner;

public class Programa {

    static Scanner read = new Scanner(System.in);
    private Integer idPrograma;
    private String nombrePrograma;
    private Integer duracionPrograma;
    private String registroGovPrograma;
    private String escuelaPrograma;

    public Programa() {
    }

    public Programa(Integer idPrograma, String nombrePrograma, Integer duracionPrograma, String registroGov, String escuela) {
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
        this.duracionPrograma = duracionPrograma;
        this.registroGovPrograma = registroGov;
        this.escuelaPrograma = escuela;
    }

    public Integer getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public Integer getDuracionPrograma() {
        return duracionPrograma;
    }

    public void setDuracionPrograma(Integer duracionPrograma) {
        this.duracionPrograma = duracionPrograma;
    }

    public String getRegistroGovPrograma() {
        return registroGovPrograma;
    }

    public void setRegistroGovPrograma(String registroGovPrograma) {
        this.registroGovPrograma = registroGovPrograma;
    }

    public String getEscuelaPrograma() {
        return escuelaPrograma;
    }

    public void setEscuelaPrograma(String escuelaPrograma) {
        this.escuelaPrograma = escuelaPrograma;
    }

    public void crearPrograma(){
        System.out.println("Ingrese el nombre del programa: ");
        nombrePrograma = read.nextLine();
        System.out.println("Ingrese el ID del programa: ");
        idPrograma = read.nextInt();
        System.out.println("Ingrese la duracion del programa: ");
        duracionPrograma = read.nextInt();
        read.skip("\n");
        System.out.println("Ingrese el registro del programa: ");
        registroGovPrograma = read.nextLine();
        System.out.println("Ingrese la escuela del programa: ");
        escuelaPrograma = read.nextLine();
    }


    public void imprimir() {
        System.out.println( "Programa{" +
                "id=" + idPrograma +
                ", nombre ='" + nombrePrograma + '\'' +
                ", duracion=" + duracionPrograma +
                ", registro='" + registroGovPrograma + '\'' +
                ", escuela='" + escuelaPrograma + '\'' );
    }
}
