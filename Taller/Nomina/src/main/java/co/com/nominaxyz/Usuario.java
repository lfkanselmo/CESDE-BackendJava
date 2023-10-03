package co.com.nominaxyz;

public class Usuario extends ServiceUtil{
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String email;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void crearUsuario(Cargo cargo) {
        System.out.println();
        System.out.println("Ingrese id: ");
        this.id = sc.nextLine().toLowerCase();
        System.out.println("Ingrese nombre: ");
        this.nombre = sc.nextLine().toLowerCase();
        System.out.println("Ingrese apellido: ");
        this.apellido = sc.nextLine().toLowerCase();
        System.out.println("Ingrese email: ");
        this.email = sc.nextLine().toLowerCase();
        System.out.println();
    }

    @Override
    public void verUsuario() {
        System.out.println();
        System.out.println(
                "ID: " + this.id + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Email: " + this.email
        );
    }
}
