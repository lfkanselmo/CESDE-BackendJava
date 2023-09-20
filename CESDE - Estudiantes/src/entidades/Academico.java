package entidades;

public abstract class Academico extends Usuario{

    protected String escuela;

    public Academico() {
    }

    public Academico(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono,String escuela) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.escuela = escuela;
    }

}
