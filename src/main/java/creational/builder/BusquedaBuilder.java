package creational.builder;

import java.util.List;

public class BusquedaBuilder {
    private String destino;
    private int huespedes        = 1;
    private double precioMaximo  = Double.MAX_VALUE;
    private List<String> amenidades = List.of();
    private double puntuacionMinima = 0;

    public BusquedaBuilder conDestino(String destino) {
        this.destino = destino;
        return this;
    }
    public BusquedaBuilder conHuespedes(int n) {
        this.huespedes = n;
        return this;
    }
    public BusquedaBuilder conPrecioMaximo(double max) {
        this.precioMaximo = max;
        return this;
    }
    public BusquedaBuilder conAmenidades(List<String> amenidades) {
        this.amenidades = amenidades;
        return this;
    }
    public BusquedaBuilder conPuntuacionMinima(double min) {
        this.puntuacionMinima = min;
        return this;
    }

    public ConsultaBusqueda construir() {
        if (destino == null || destino.isBlank())
            throw new IllegalStateException("El destino es obligatorio.");
        return new ConsultaBusqueda(destino, huespedes, precioMaximo, amenidades, puntuacionMinima);
    }
}
