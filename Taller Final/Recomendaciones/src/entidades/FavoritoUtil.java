package entidades;

public abstract class FavoritoUtil implements Favorito{


    protected String nombre;
    protected String autor;
    protected String sinopsis;
    protected boolean meGusta;
    protected String comentario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean isMeGusta() {
        return meGusta;
    }

    public void setMeGusta(boolean meGusta) {
        this.meGusta = meGusta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public void crear() {
        System.out.println("Ingrese nombre: ");
        this.nombre = read.nextLine();
        System.out.println("Ingrese el autor");
        this.autor = read.nextLine();
        System.out.println("Ingrese la sinopsis");
        this.sinopsis = read.nextLine();
        this.meGusta = false;
        this.comentario = "";
    }

    @Override
    public String toString() {
        return "{" +
                ", nombre: '" + nombre + "\n" +
                ", autor: '" + autor + "\n" +
                ", sinopsis: '" + sinopsis + "\n" +
                ", ¿Me gusta?: '" + meGusta + "\n" +
                ", Comentario: '" + comentario + "\n" +
                '}';
    }
}
