package behavioral.memento;

public class Cliente {
    private final BusquedaActiva   busqueda  = new BusquedaActiva();
    private final GestorNavegacion gestor    = new GestorNavegacion();

    public BusquedaActiva getBusqueda()      { return busqueda; }
    public GestorNavegacion getGestor()      { return gestor; }

    public void mostrar(String etiqueta) {
        System.out.println("=== " + etiqueta + " ===");
        System.out.println("Destino   : " + busqueda.getDestino());
        System.out.println("Fechas    : " + busqueda.getFechaEntrada() + " → " + busqueda.getFechaSalida());
        System.out.println("Amenidades: " + busqueda.getAmenidades());
        System.out.println("Vista     : " + busqueda.getVista());
        System.out.println("---");
    }
}
