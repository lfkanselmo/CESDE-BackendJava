package entidades;

import java.util.ArrayList;

public class Lector extends UserUtil{



    @Override
    public void darMeGusta(ArrayList<Favorito> recomendados) {
        System.out.println("Escriba el nombre del recomendado al que le quiere dar me gusta");
        String nombreRecomendado = read.nextLine();

        recomendados.forEach((p) -> {
            FavoritoUtil favorito = (FavoritoUtil)(p);
            if (favorito.getNombre().equalsIgnoreCase(nombreRecomendado)){
                favorito.setMeGusta(true);
                System.out.println("Me gusta agregado con exito");
                System.out.println();
            }
        });
    }

    @Override
    public void comentar(ArrayList<Favorito> recomendados) {
        System.out.println("Escriba el nombre del recomendado al que le quiere dejarle comentario");
        String nombreRecomendado = read.nextLine();

        recomendados.forEach((p) -> {
            FavoritoUtil favorito = (FavoritoUtil)(p);
            if (favorito.getNombre().equalsIgnoreCase(nombreRecomendado)){
                System.out.println("Ingrese comentario");
                favorito.setComentario(read.nextLine());
                System.out.println("Comentarios agregado con exito");
                System.out.println();
            }
        });
    }
}
