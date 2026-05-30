package creational.prototype;

public class Cliente {

    public PropiedadPrototipo duplicar(PropiedadPrototipo prototipo) {
        return prototipo.clonar();
    }

    public void mostrar(String etiqueta, PropiedadPrototipo pp) {
        Propiedad p = pp.getPropiedad();
        System.out.println("=== " + etiqueta + " ===");
        System.out.println("Título    : " + p.getTitulo());
        System.out.println("Precio    : $" + p.getPrecioBase());
        System.out.println("Ciudad    : " + p.getUbicacion().getCiudad());
        System.out.println("Dirección : " + p.getUbicacion().getDireccion());
        System.out.println("Piso      : " + p.getUbicacion().getPiso());
        System.out.println("Amenidades: " + p.getAmenidades());
        System.out.println("---");
    }
}
