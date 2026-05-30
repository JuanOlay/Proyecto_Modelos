package behavioral.iterator;

import java.util.List;

public class IteradorLista implements IteradorPropiedades {
    private final List<Propiedad> propiedades;
    private int indice = 0;

    public IteradorLista(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public boolean hayMas() {
        return indice < propiedades.size();
    }

    @Override
    public Propiedad siguiente() {
        return propiedades.get(indice++);
    }
}
