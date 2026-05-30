package creational.prototype;

import java.util.List;

public class Propiedad {
    private String titulo;
    private double precioBase;
    private Ubicacion ubicacion;
    private List<String> amenidades;

    public Propiedad(String titulo, double precioBase,
                     Ubicacion ubicacion, List<String> amenidades) {
        this.titulo     = titulo;
        this.precioBase = precioBase;
        this.ubicacion  = ubicacion;
        this.amenidades = amenidades;
    }

    public void setTitulo(String titulo)         { this.titulo = titulo; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public void setUbicacion(Ubicacion ubicacion){ this.ubicacion = ubicacion; }

    public String getTitulo()              { return titulo; }
    public double getPrecioBase()          { return precioBase; }
    public Ubicacion getUbicacion()        { return ubicacion; }
    public List<String> getAmenidades()    { return amenidades; }
}
