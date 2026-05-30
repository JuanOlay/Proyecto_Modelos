package creational.factorymethod;

public class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("[PUSH] " + mensaje);
    }
}
