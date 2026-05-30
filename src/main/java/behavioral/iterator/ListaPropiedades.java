package behavioral.iterator;

import java.util.List;

public class ListaPropiedades implements ColeccionPropiedades {
    private final List<Propiedad> propiedades;

    public ListaPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public IteradorPropiedades crearIterador() {
        return new IteradorLista(propiedades);
    }
}
