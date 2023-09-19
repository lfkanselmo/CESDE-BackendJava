package entidades;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String numeroCelular;
    private String contrasenha;
    private String direccion;

    public Usuario(String id, String nombre, String email, String numeroCelular, String contrasenha, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.contrasenha = contrasenha;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
