package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ComplejoAlojamiento implements ComponenteAlojamiento {
    private final String nombre;
    private final List<ComponenteAlojamiento> hijos = new ArrayList<>();

    public ComplejoAlojamiento(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteAlojamiento componente)  { hijos.add(componente); }
    public void eliminar(ComponenteAlojamiento componente) { hijos.remove(componente); }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getCapacidad() {
        return hijos.stream().mapToInt(ComponenteAlojamiento::getCapacidad).sum();
    }

    @Override
    public double getPrecio() {
        return hijos.stream().mapToDouble(ComponenteAlojamiento::getPrecio).sum();
    }

    @Override
    public List<String> getAmenidades() {
        List<String> todas = new ArrayList<>();
        for (ComponenteAlojamiento hijo : hijos)
            for (String amenidad : hijo.getAmenidades())
                if (!todas.contains(amenidad))
                    todas.add(amenidad);
        return todas;
    }
}