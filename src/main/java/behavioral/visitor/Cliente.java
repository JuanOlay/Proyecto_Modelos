package behavioral.visitor;

import java.util.List;

public class Cliente {

    public void ejecutarAnalisis(String etiqueta, Visitante visitante, List<Alojamiento> alojamientos) {
        System.out.println("=== " + etiqueta + " ===");
        for (Alojamiento a : alojamientos)
            a.aceptar(visitante);
        System.out.println("---");
    }
}
