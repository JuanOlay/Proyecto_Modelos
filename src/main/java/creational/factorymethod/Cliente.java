package creational.factorymethod;

public class Cliente {

    public void procesarEvento(NotificadorEvento notificador, String mensaje) {
        notificador.notificar(mensaje);
    }
}
