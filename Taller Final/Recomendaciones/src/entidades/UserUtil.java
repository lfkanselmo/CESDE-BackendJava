package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class UserUtil implements UserInterface {

    protected final Scanner read = new Scanner(System.in);
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void darMeGusta(ArrayList<Favorito> recomendados) {

    }

    @Override
    public void comentar(ArrayList<Favorito> recomendados) {

    }

    @Override
    public void registrar(ArrayList<Favorito> recomendados) {

    }
}
