package principios_poo;

import java.util.Scanner;

public class Hija extends Padre{

    private static final Scanner read = new Scanner(System.in);

    private String apellidoMadre;

    public Hija(String apellidoPadre, String apellidoMadre) {
        super(apellidoPadre);
        this.apellidoMadre = apellidoMadre;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    @Override
    public void crearPadre() {
        super.crearPadre();
        this.apellidoMadre = read.nextLine();
    }

    @Override
    public void verPadre() {
        this.getNombrePadre();
    }
}

