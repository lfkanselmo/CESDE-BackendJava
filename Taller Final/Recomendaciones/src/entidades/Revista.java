package entidades;

public class Revista extends FavoritoUtil{
    @Override
    public void crear() {
        super.crear();
    }

    @Override
    public String toString() {
        return "Tipo: Revista " + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Autor: " + this.autor + "\n" +
                "Sinopsis: " + this.sinopsis + "\n";
    }
}
