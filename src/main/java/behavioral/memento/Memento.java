package behavioral.memento;

import java.util.List;

public class Memento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        BusquedaActiva   busqueda = cliente.getBusqueda();
        GestorNavegacion gestor   = cliente.getGestor();

        busqueda.setEstado("Barcelona", "2025-08-01", "2025-08-07",
                List.of("WiFi", "Piscina"), "lista");
        gestor.guardar(busqueda);
        cliente.mostrar("Estado inicial guardado");

        busqueda.setEstado("Madrid", "2025-09-10", "2025-09-15",
                List.of("WiFi", "Cocina"), "mapa");
        gestor.guardar(busqueda);
        cliente.mostrar("Segunda búsqueda guardada");

        busqueda.setEstado("Valencia", "2025-10-01", "2025-10-05",
                List.of("Parking"), "lista");
        cliente.mostrar("Búsqueda sin guardar (usuario navega a ficha)");

        gestor.restaurar(busqueda);
        cliente.mostrar("Atrás → restaurado al segundo estado");

        gestor.restaurar(busqueda);
        cliente.mostrar("Atrás → restaurado al primer estado");
    }
}