package creational.builder;

public class Cliente {

    private final Director director = new Director();

    public ConsultaBusqueda busquedaBasica(String destino, int huespedes) {
        BusquedaBuilder b = new BusquedaBuilder();
        director.busquedaBasica(b, destino, huespedes);
        ConsultaBusqueda consulta = b.construir();
        mostrar(consulta);
        return consulta;
    }

    public ConsultaBusqueda busquedaFiltrada(String destino, int huespedes,
                                              double precioMax, java.util.List<String> amenidades,
                                              double puntuacion) {
        BusquedaBuilder b = new BusquedaBuilder();
        director.busquedaFiltrada(b, destino, huespedes, precioMax, amenidades, puntuacion);
        ConsultaBusqueda consulta = b.construir();
        mostrar(consulta);
        return consulta;
    }

    private void mostrar(ConsultaBusqueda c) {
        System.out.println("Destino: "    + c.getDestino());
        System.out.println("Huéspedes: "  + c.getHuespedes());
        System.out.println("Precio máx: " + c.getPrecioMaximo());
        System.out.println("Amenidades: " + c.getAmenidades());
        System.out.println("Puntuación: " + c.getPuntuacionMinima());
        System.out.println("---");
    }
}