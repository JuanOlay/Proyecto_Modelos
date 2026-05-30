package behavioral.iterator;

public class Cliente {

    public void recorrer(String etiqueta, ColeccionPropiedades coleccion) {
        System.out.println("=== " + etiqueta + " ===");
        IteradorPropiedades iterador = coleccion.crearIterador();
        while (iterador.hayMas()) {
            Propiedad p = iterador.siguiente();
            System.out.println("  " + p.getNombre() + " — " + p.getCiudad() + " — $" + p.getPrecio());
        }
        System.out.println("---");
    }
}
