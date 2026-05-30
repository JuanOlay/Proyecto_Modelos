package structural.proxy;

public class PerfilAnfitrionReal implements PerfilAnfitrion {
    private final String nombre;
    private final String telefono;
    private final String direccion;

    public PerfilAnfitrionReal(String nombre, String telefono, String direccion) {
        this.nombre    = nombre;
        this.telefono  = telefono;
        this.direccion = direccion;
    }

    @Override public String getNombre()    { return nombre; }
    @Override public String getTelefono()  { return telefono; }
    @Override public String getDireccion() { return direccion; }
}
