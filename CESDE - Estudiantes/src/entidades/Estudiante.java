package entidades;

public class Estudiante extends Academico{

    private String programa;

    //constructores

    public  Estudiante(){
    }


    public Estudiante(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String carrera, String escuela) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono, escuela);
        this.programa = carrera;
    }

    public String getCarrera() {
        return programa;
    }

    public void setCarrera(String carrera) {
        this.programa = carrera;
    }

}


