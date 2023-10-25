package entidades;

public class Pelicula extends FavoritoUtil{
    @Override
    public void crear() {
        super.crear();
    }

    @Override
    public String toString() {
        return "Tipo: Pelicula " + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Autor: " + this.autor + "\n" +
                "Sinopsis: " + this.sinopsis + "\n";
    }
}
