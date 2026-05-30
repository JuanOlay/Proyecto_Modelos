package creational.factorymethod;

public class NotificacionSMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("[SMS] " + mensaje);
    }
}
