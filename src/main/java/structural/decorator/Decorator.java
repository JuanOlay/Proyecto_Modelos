package structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Reserva simple = new ReservaBase("Apartamento Eixample", 95.0, 3);
        cliente.mostrar(simple);

        Reserva conSeguro = new DecoradorSeguro(
                            new ReservaBase("Apartamento Eixample", 95.0, 3));
        cliente.mostrar(conSeguro);

        Reserva completa = new DecoradorKitBienvenida(
                           new DecoradorTraslado(
                           new DecoradorSeguro(
                           new ReservaBase("Apartamento Eixample", 95.0, 3))));
        cliente.mostrar(completa);
    }
}
