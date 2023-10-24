package servicios;

import dominio.ServicioMensaje;

public class SMSServicio implements ServicioMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}
