package entidades;

import java.util.ArrayList;

public class Administrador extends UserUtil{
    @Override
    public void registrar(ArrayList<Favorito> recomendados) {

        Favorito favorito;

        System.out.println(
                """
                        
                        Elija que quiere agregar:
                        1. Libro
                        2. Pelicula
                        3. Revista
                        4. Cancion
                        5. Cancelar
                    
                        """
        );

        String opc = read.nextLine();

        switch (opc){
            case "1":
                favorito = new Libro();
                favorito.crear();
                recomendados.add(favorito);
                break;

            case "2":
                favorito = new Pelicula();
                favorito.crear();
                recomendados.add(favorito);
                break;

            case "3":
                favorito = new Revista();
                favorito.crear();
                recomendados.add(favorito);
                break;

            case "4":
                favorito = new Cancion();
                favorito.crear();
                recomendados.add(favorito);
                break;

            case "5":
                System.out.println("Cancelando. No se creó recomendación");
                break;

            default:
                System.out.println("Elección no válida");
                break;
        }



    }
}
