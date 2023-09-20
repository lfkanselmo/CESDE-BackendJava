package entidades;

public class EmpleadoEscuela extends Academico {
    private double salario;
    private String rol;

    public EmpleadoEscuela(){
        super();
    }

    public EmpleadoEscuela(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String escuela, double salario, String rol) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono, escuela);
        this.salario = salario;
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Agregue la escuela");
        this.escuela = read.next();
        System.out.println("Agregue el rol");
        this.rol = read.next();
        System.out.println("Agregue el salario");
        this.salario = read.nextDouble();
        read.skip("\n");
    }
}

