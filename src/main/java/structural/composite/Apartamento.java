package structural.composite;

import java.util.List;

public class Apartamento implements ComponenteAlojamiento {
    private final String nombre;
    private final int capacidad;
    private final double precio;
    private final List<String> amenidades;

    public Apartamento(String nombre, int capacidad, double precio, List<String> amenidades) {
        this.nombre     = nombre;
        this.capacidad  = capacidad;
        this.precio     = precio;
        this.amenidades = amenidades;
    }

    @Override public String getNombre()             { return nombre; }
    @Override public int getCapacidad()             { return capacidad; }
    @Override public double getPrecio()             { return precio; }
    @Override public List<String> getAmenidades()   { return amenidades; }
}
