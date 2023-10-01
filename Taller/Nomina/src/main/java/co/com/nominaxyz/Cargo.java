package co.com.nominaxyz;

import java.util.Scanner;

public class Cargo {
    Scanner sc = new Scanner(System.in);
    private String idCargo;
    private String nombreCargo;
    private double salarioCargo;

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public double getSalarioCargo() {
        return salarioCargo;
    }

    public void setSalarioCargo(double salarioCargo) {
        this.salarioCargo = salarioCargo;
    }

    public void crearCargo() {
        System.out.println();
        System.out.println("---------- CARGO NUEVO ----------");
        System.out.println("Ingrese el ID del cargo: ");
        this.idCargo = sc.nextLine();
        System.out.println("Ingrese el nombre del cargo: ");
        this.nombreCargo = sc.nextLine();
        System.out.println("Ingrese el salario base del cargo: ");
        this.salarioCargo = sc.nextDouble();
        System.out.println();
    }

    public void verCargo() {
        System.out.println(
                "ID: " + this.idCargo + "\n" +
                        "Cargo: " + this.nombreCargo + "\n" +
                        "Salario base: " + this.salarioCargo + "\n"
        );
    }

}
