package creational.builder;

import java.util.List;

public class Director {

    public void busquedaBasica(BusquedaBuilder b, String destino, int huespedes) {
        b.conDestino(destino)
         .conHuespedes(huespedes);
    }

    public void busquedaFiltrada(BusquedaBuilder b, String destino, int huespedes,
                                  double precioMax, List<String> amenidades, double puntuacion) {
        b.conDestino(destino)
         .conHuespedes(huespedes)
         .conPrecioMaximo(precioMax)
         .conAmenidades(amenidades)
         .conPuntuacionMinima(puntuacion);
    }
}