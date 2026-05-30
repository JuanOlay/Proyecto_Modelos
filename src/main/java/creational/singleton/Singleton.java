package creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.mostrarConfiguracion("Motor de reservas");
        cliente.mostrarConfiguracion("Servicio de pagos");

        cliente.actualizarComision(0.15);
        cliente.actualizarPolitica("Flexible");

        cliente.mostrarConfiguracion("Motor de reservas (tras actualización)");
        cliente.mostrarConfiguracion("Panel de anfitriones");
    }
}
