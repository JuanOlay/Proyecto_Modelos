package structural.flyweight;

import java.util.List;

public class Propiedad {
    private final String titulo;
    private final String ciudad;
    private final List<Amenidad> amenidades;

    public Propiedad(String titulo, String ciudad, List<Amenidad> amenidades) {
        this.titulo     = titulo;
        this.ciudad     = ciudad;
        this.amenidades = amenidades;
    }

    public String getTitulo()              { return titulo; }
    public String getCiudad()              { return ciudad; }
    public List<Amenidad> getAmenidades()  { return amenidades; }
}
