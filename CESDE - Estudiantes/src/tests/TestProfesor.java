package tests;

import entidades.Profesor;

public class TestProfesor {

    public static void main(String[] args) {
        Profesor profe = new Profesor();
        profe.registrarUsuario();
        profe.imprimir();
        profe.iniciarsesion();

    }


}
