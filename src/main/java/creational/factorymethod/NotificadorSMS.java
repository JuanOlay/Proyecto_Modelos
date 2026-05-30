package creational.factorymethod;

public class NotificadorSMS extends NotificadorEvento {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
