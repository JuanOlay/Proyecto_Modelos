package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaAmenidades {
    private final Map<String, Amenidad> cache = new HashMap<>();

    public Amenidad obtener(String nombre, String descripcion, String icono, String categoria) {
        return cache.computeIfAbsent(nombre, k -> new Amenidad(nombre, descripcion, icono, categoria));
    }

    public int totalInstancias() {
        return cache.size();
    }
}
