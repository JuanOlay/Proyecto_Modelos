package structural.composite;

import java.util.List;

public class Composite {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Habitacion hab1 = new Habitacion("Habitación 101", 2, 40.0, List.of("WiFi", "Baño privado"));
        Habitacion hab2 = new Habitacion("Habitación 102", 3, 55.0, List.of("WiFi", "Terraza"));

        Apartamento apto1 = new Apartamento("Apartamento 2A", 4, 120.0, List.of("WiFi", "Cocina", "Lavadora"));
        Apartamento apto2 = new Apartamento("Apartamento 2B", 5, 150.0, List.of("WiFi", "Cocina", "Piscina"));

        ComplejoAlojamiento planta1 = new ComplejoAlojamiento("Planta 1 - Habitaciones");
        planta1.agregar(hab1);
        planta1.agregar(hab2);

        ComplejoAlojamiento planta2 = new ComplejoAlojamiento("Planta 2 - Apartamentos");
        planta2.agregar(apto1);
        planta2.agregar(apto2);

        ComplejoAlojamiento edificio = new ComplejoAlojamiento("Edificio Eixample Central");
        edificio.agregar(planta1);
        edificio.agregar(planta2);

        cliente.mostrar(hab1);
        cliente.mostrar(apto1);
        cliente.mostrar(planta1);
        cliente.mostrar(edificio);
    }
}