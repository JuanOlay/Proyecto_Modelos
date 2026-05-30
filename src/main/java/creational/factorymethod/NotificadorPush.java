package creational.factorymethod;

public class NotificadorPush extends NotificadorEvento {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionPush();
    }
}