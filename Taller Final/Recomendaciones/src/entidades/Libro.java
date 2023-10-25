package entidades;

public class Libro extends FavoritoUtil{
    @Override
    public void crear() {
        super.crear();
    }

    @Override
    public String toString() {
        return "Tipo: Libro " + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Autor: " + this.autor + "\n" +
                "Sinopsis: " + this.sinopsis + "\n";
    }
}
