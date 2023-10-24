package servicios;

import dominio.ServicioMensaje;

public class WhatsAppServicio implements ServicioMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("WhatsApp: " + mensaje);
    }
}
