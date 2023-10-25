package entidades;

public class Cancion extends FavoritoUtil{
    @Override
    public void crear() {
        super.crear();
    }

    @Override
    public String toString() {
        return "Tipo: Cancion " + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Autor: " + this.autor + "\n" +
                "Sinopsis: " + this.sinopsis + "\n";
    }
}
