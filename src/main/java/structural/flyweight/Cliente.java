package structural.flyweight;

public class Cliente {
    private final FabricaAmenidades fabrica = new FabricaAmenidades();

    public Amenidad obtenerAmenidad(String nombre, String descripcion, String icono, String categoria) {
        return fabrica.obtener(nombre, descripcion, icono, categoria);
    }

    public void mostrar(Propiedad propiedad) {
        System.out.println("=== " + propiedad.getTitulo() + " — " + propiedad.getCiudad() + " ===");
        for (Amenidad a : propiedad.getAmenidades())
            System.out.println("  [" + a.getCategoria() + "] " + a.getIcono()
                    + " " + a.getNombre() + ": " + a.getDescripcion());
        System.out.println("---");
    }

    public void mostrarEstadoFabrica() {
        System.out.println("Instancias únicas de Amenidad en memoria: " + fabrica.totalInstancias());
    }
}
