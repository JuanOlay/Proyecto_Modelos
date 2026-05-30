package behavioral.iterator;

public class Propiedad {
    private final String nombre;
    private final String ciudad;
    private final double precio;

    public Propiedad(String nombre, String ciudad, double precio) {
        this.nombre  = nombre;
        this.ciudad  = ciudad;
        this.precio  = precio;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public double getPrecio() { return precio; }
}