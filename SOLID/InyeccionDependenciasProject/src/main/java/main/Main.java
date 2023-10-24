package main;

import controlador.Notificacion;
import dominio.ServicioMensaje;
import servicios.EmailServicio;
import servicios.SMSServicio;
import servicios.WhatsAppServicio;

public class Main {
    public static void main(String[] args) {
        ServicioMensaje servicioEmail = new EmailServicio();
        ServicioMensaje servicioSMS = new SMSServicio();
        ServicioMensaje servicioWhatsApp = new WhatsAppServicio();

        Notificacion notificacionEmail = new Notificacion(servicioEmail);
        notificacionEmail.notificar("En las orillas del silecio, se desgarran a gritos los tristes");

        Notificacion notificacionSMS = new Notificacion(servicioSMS);
        notificacionSMS.notificar("Los hombres se ven a si mismos como bestias salvajes que hay que temer");

        Notificacion notificacionWhatsApp = new Notificacion(servicioWhatsApp);
        notificacionWhatsApp.notificar("El ser humano dejó de ser un consumidor de productos para convertirse " +
                "en un producto que debe ser consumido");

    }
}
