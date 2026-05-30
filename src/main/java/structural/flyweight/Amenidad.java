package structural.flyweight;

public class Amenidad {
    private final String nombre;
    private final String descripcion;
    private final String icono;
    private final String categoria;

    public Amenidad(String nombre, String descripcion, String icono, String categoria) {
        this.nombre      = nombre;
        this.descripcion = descripcion;
        this.icono       = icono;
        this.categoria   = categoria;
    }

    public String getNombre()      { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getIcono()       { return icono; }
    public String getCategoria()   { return categoria; }
}
