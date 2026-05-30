package creational.prototype;

public class Ubicacion {
    private String ciudad;
    private String direccion;
    private String piso;

    public Ubicacion(String ciudad, String direccion, String piso) {
        this.ciudad    = ciudad;
        this.direccion = direccion;
        this.piso      = piso;
    }

    public Ubicacion copiar() {
        return new Ubicacion(ciudad, direccion, piso);
    }

    public void setPiso(String piso)          { this.piso = piso; }
    public String getCiudad()                 { return ciudad; }
    public String getDireccion()              { return direccion; }
    public String getPiso()                   { return piso; }
}
