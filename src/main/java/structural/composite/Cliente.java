package structural.composite;

public class Cliente {

    public void mostrar(ComponenteAlojamiento componente) {
        System.out.println("=== " + componente.getNombre() + " ===");
        System.out.println("Capacidad  : " + componente.getCapacidad() + " huéspedes");
        System.out.println("Precio     : $" + componente.getPrecio());
        System.out.println("Amenidades : " + componente.getAmenidades());
        System.out.println("---");
    }
}
