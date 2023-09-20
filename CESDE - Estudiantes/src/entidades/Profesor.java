package entidades;

public class Profesor extends Academico {

    private String curso;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String escuela, String curso) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono, escuela);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Agregue la escuela");
        this.escuela = read.next();
        System.out.println("Agregue el curso");
        this.curso = read.next();
        read.skip("\n");
    }

    @Override
    public void imprimir() {
        System.out.print("Profesor: " + '\n');
        super.imprimir();
        System.out.print(" " +
                "escuela=" + escuela + '\n'
                + " curso='" + curso + '\n');
    }
}
