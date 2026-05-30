package structural.facade;

public class Facade {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.confirmar(
                "Apartamento Eixample 4A",
                "Carlos",
                "María",
                "2025-08-01",
                "2025-08-07",
                570.0
        );
    }
}
