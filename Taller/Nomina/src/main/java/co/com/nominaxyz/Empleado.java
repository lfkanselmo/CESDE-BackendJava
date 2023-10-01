package co.com.nominaxyz;

public class Empleado extends Usuario {
    protected Cargo cargo;
    protected String area;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void crearUsuario(Cargo cargo) {
        System.out.println("---------- EMPLEADO NUEVO ----------");
        super.crearUsuario(cargo);
        this.cargo = cargo;
        System.out.println("Ingrese el area de trabajo: ");
        this.area = sc.nextLine();
    }

    @Override
    public void verUsuario() {
        super.verUsuario();
        System.out.println(
                "Cargo: " + this.cargo.getNombreCargo() + "\n" +
                        "Salario: " + this.cargo.getSalarioCargo()
        );
    }
}
