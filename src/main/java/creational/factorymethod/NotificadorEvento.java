package creational.factorymethod;

public abstract class NotificadorEvento {

    protected abstract Notificacion crearNotificacion();

    public void notificar(String mensaje) {
        crearNotificacion().enviar(mensaje);
    }
}