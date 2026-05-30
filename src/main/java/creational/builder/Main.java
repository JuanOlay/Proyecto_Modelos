package creational.builder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.busquedaBasica("Barcelona", 2);

        cliente.busquedaFiltrada("Ciudad de México", 4, 150.0,
                List.of("WiFi", "Piscina"), 4.5);
    }
}
