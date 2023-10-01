package co.com.nominaxyz;

public class Nomina extends ServiceUtil {
    private String idNomina;
    private Empleado empleado;
    private double salarioFinal;

    public String getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public void crearNomina(Empleado empleado) {
        System.out.println("---------- NUEVA NOMINA ----------");
        System.out.println("Ingrese el ID de la nomina: ");
        this.idNomina = sc.nextLine();
        this.empleado = empleado;
        this.salarioFinal = salarioFinal(empleado.getCargo().getSalarioCargo());
    }

    private double salarioFinal(Double salarioBase) {
        double salarioMinimo = 1160000;
        double salarioF = 0d;
        double salud = salarioBase * 0.04;
        double pension = salarioBase * 0.04;
        double auxTransporte = 140600;

        salarioF = salarioBase - salud - pension;

        if (salarioBase < (salarioMinimo * 2)) {
            salarioF += auxTransporte;
        }

        return salarioF;
    }

    public void imprimirColilla() {
        System.out.println("----------------------------------------------------------------");
        System.out.println(
                "ID nomina: " + this.idNomina + "\n" +
                        "Salario final: " + this.salarioFinal + "\n" +
                        "ID empleado: " + this.empleado.getId() + "\n" +
                        "Nombre empleado: " + this.empleado.getNombre() + "\n" +
                        "Apellido empleado: " + this.empleado.getApellido() + "\n" +
                        "Cargo del empleado: " + this.empleado.getCargo().getNombreCargo() + "\n" +
                        "Area del empleado: " + this.empleado.getArea() + "\n"
        );

        System.out.println("----------------------------------------------------------------");
    }
}
