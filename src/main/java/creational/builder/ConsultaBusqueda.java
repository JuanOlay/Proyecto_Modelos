package creational.builder;

import java.util.List;

public class ConsultaBusqueda {
    private final String destino;
    private final int huespedes;
    private final double precioMaximo;
    private final List<String> amenidades;
    private final double puntuacionMinima;

    ConsultaBusqueda(String destino, int huespedes, double precioMaximo,
                     List<String> amenidades, double puntuacionMinima) {
        this.destino          = destino;
        this.huespedes        = huespedes;
        this.precioMaximo     = precioMaximo;
        this.amenidades       = amenidades;
        this.puntuacionMinima = puntuacionMinima;
    }

    public String getDestino()             { return destino; }
    public int getHuespedes()              { return huespedes; }
    public double getPrecioMaximo()        { return precioMaximo; }
    public List<String> getAmenidades()    { return amenidades; }
    public double getPuntuacionMinima()    { return puntuacionMinima; }
}