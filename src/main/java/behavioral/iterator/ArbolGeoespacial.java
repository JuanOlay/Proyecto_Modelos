package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ArbolGeoespacial implements ColeccionPropiedades {
    private final Nodo raiz;

    public ArbolGeoespacial(Nodo raiz) {
        this.raiz = raiz;
    }

    @Override
    public IteradorPropiedades crearIterador() {
        List<Propiedad> enOrden = new ArrayList<>();
        recorrer(raiz, enOrden);
        return new IteradorLista(enOrden);
    }

    private void recorrer(Nodo nodo, List<Propiedad> resultado) {
        if (nodo == null) return;
        recorrer(nodo.izquierdo, resultado);
        resultado.add(nodo.propiedad);
        recorrer(nodo.derecho, resultado);
    }
}
