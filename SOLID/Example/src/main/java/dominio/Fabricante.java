package dominio;

public class Fabricante {
    private int id;
    private String nombre;

    public Fabricante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Fabricante(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
