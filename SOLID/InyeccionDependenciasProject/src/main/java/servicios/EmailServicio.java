package servicios;

import dominio.ServicioMensaje;

public class EmailServicio implements ServicioMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Email: " + mensaje);
    }
}
