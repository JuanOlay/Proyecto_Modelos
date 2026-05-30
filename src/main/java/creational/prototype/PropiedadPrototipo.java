package creational.prototype;

import java.util.ArrayList;

public class PropiedadPrototipo implements Prototipo {
    private final Propiedad propiedad;

    public PropiedadPrototipo(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    @Override
    public PropiedadPrototipo clonar() {
        Propiedad copia = new Propiedad(
                propiedad.getTitulo(),
                propiedad.getPrecioBase(),
                propiedad.getUbicacion().copiar(),
                new ArrayList<>(propiedad.getAmenidades())
        );
        return new PropiedadPrototipo(copia);
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }
}
