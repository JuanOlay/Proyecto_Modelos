package creational.factorymethod;

public class FactoryMethod {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.procesarEvento(new NotificadorEmail(), "Reserva confirmada en Barcelona.");
        cliente.procesarEvento(new NotificadorPush(),  "Tienes un mensaje de tu anfitrión.");
        cliente.procesarEvento(new NotificadorSMS(),   "Recordatorio: check-in mañana a las 15:00.");
    }
}
