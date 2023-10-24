package controlador;

import dominio.ServicioMensaje;

public class Notificacion {
    private ServicioMensaje servicio;

    public Notificacion(ServicioMensaje servicio){
        this.servicio = servicio;
    }

    public void notificar(String mensaje){
        servicio.enviarMensaje(mensaje);
    }

}
