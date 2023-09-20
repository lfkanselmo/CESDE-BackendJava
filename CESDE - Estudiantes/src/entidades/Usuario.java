package entidades;

import java.util.Scanner;

public class Usuario {
    static Scanner read = new Scanner(System.in);




    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contrasena;
    protected String direccion;
    protected String telefono;



    public Usuario(){

    }




    public Usuario(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public void registrarUsuario(){

        System.out.println("Ingrese su id: " );
        this.id = read.nextInt();
        read.skip("\n");

        System.out.println("Ingrese su nombre: " );
        this.nombre = read.nextLine();

        System.out.println("Ingrese su apellido: " );
        this.apellido = read.nextLine();

        System.out.println("Ingrese su correo: " );
        this.correo = read.nextLine();

        System.out.println("Ingrese su contrasena: " );
        this.contrasena = read.nextLine();

        System.out.println("Ingrese su direccion: " );
        this.direccion = read.nextLine();

        System.out.println("Ingrese su telefono: " );
        this.telefono = read.nextLine();

    }

    public void imprimir() {
        System.out.print(" id=" + id + '\n' +
                " nombre='" + nombre + '\n' +
                " apellido='" + apellido + '\n' +
                " correo='" + correo + '\n' +
                " contrasena='" + contrasena + '\n' +
                " direccion='" + direccion + '\n' +
                " telefono='" + telefono + '\n');
    }

    public void iniciarsesion(){
        System.out.println("Ingrese el correo registrado");
        String correoRegistrado = read.nextLine();
        System.out.println("Ingrese la contrasena registrada");
        String contrasenaReg = read.nextLine();

        if(contrasena.equals(contrasenaReg)&&correo.equals(correoRegistrado)){
            System.out.println("Bienvenido "+nombre);
        }else{
            System.out.println("credenciales no validas");
        }
    }

}

