package co.com.nominaxyz.tests;

import co.com.nominaxyz.Cargo;
import co.com.nominaxyz.Empleado;

public class TestEmpleadoCargo {
    public static void main(String[] args) {
        Cargo secretaria = new Cargo();
        secretaria.crearCargo();
        Cargo disenhador = new Cargo();
        disenhador.crearCargo();

        Empleado nicolas = new Empleado();
        nicolas.crearUsuario(secretaria);

        nicolas.verUsuario();
    }
}
