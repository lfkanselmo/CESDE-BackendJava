package entidades;

import java.util.ArrayList;

public interface UserInterface {
    void darMeGusta(ArrayList<Favorito> recomendados);
    void comentar(ArrayList<Favorito> recomendados);
    void registrar(ArrayList<Favorito> recomendados);
}
