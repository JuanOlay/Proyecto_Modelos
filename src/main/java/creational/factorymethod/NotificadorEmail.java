package creational.factorymethod;

public class NotificadorEmail extends NotificadorEvento {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
