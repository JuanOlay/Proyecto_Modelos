package behavioral.strategy;

public class Strategy {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Propiedad propiedad = new Propiedad("Apartamento Eixample 4A", 100.0,
                new PrecioEstacional(1.3));

        cliente.mostrarPrecio(propiedad, 5);

        cliente.cambiarEstrategia(propiedad, new PrecioPorDemanda(80.0));
        cliente.mostrarPrecio(propiedad, 5);

        cliente.cambiarEstrategia(propiedad, new DescuentoEstanciaProlongada());
        cliente.mostrarPrecio(propiedad, 3);
        cliente.mostrarPrecio(propiedad, 10);
    }
}
