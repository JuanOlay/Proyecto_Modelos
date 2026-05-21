package behavioral.chainofresponsability;

import java.util.List;

public class Anuncio {

    private final String titulo;
    private final List<Foto> fotos;
    private final String descripcion;
    private final double precioBase;
    private final double precioPromedioZona;
    private final String licenciaTuristica;

    public Anuncio(String titulo, List<Foto> fotos, String descripcion,
                   double precioBase, double precioPromedioZona, String licenciaTuristica) {
        this.titulo = titulo;
        this.fotos = fotos;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.precioPromedioZona = precioPromedioZona;
        this.licenciaTuristica = licenciaTuristica;
    }

    public String getTitulo() { return titulo; }
    public List<Foto> getFotos() { return fotos; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioBase() { return precioBase; }
    public double getPrecioPromedioZona() { return precioPromedioZona; }
    public String getLicenciaTuristica() { return licenciaTuristica; }
}
