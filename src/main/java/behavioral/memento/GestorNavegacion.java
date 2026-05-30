package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GestorNavegacion {
    private final List<InstantaneaBusqueda> historial = new ArrayList<>();

    public void guardar(BusquedaActiva busqueda) {
        historial.add(busqueda.guardar());
    }

    public void restaurar(BusquedaActiva busqueda) {
        if (!historial.isEmpty()) {
            busqueda.restaurar(historial.get(historial.size() - 1));
            historial.remove(historial.size() - 1);
        }
    }

    public int totalInstantaneas() {
        return historial.size();
    }
}
