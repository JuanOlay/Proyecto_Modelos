package structural.proxy;

public class Proxy {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        PerfilAnfitrionReal perfilReal = new PerfilAnfitrionReal(
                "Carlos Méndez",
                "+34 612 345 678",
                "Carrer de Provença 123, 4A, Barcelona"
        );

        System.out.println("=== Reserva PENDIENTE ===");
        PerfilAnfitrion proxyPendiente = new ProxyPerfilAnfitrion(perfilReal, EstadoReserva.PENDIENTE);
        cliente.mostrarPerfil(proxyPendiente);

        System.out.println("=== Reserva CONFIRMADA ===");
        PerfilAnfitrion proxyConfirmada = new ProxyPerfilAnfitrion(perfilReal, EstadoReserva.CONFIRMADA);
        cliente.mostrarPerfil(proxyConfirmada);
    }
}
