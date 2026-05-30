package behavioral.memento;

import java.util.List;

public class InstantaneaBusqueda {
    private final String       destino;
    private final String       fechaEntrada;
    private final String       fechaSalida;
    private final List<String> amenidades;
    private final String       vista;

    InstantaneaBusqueda(String destino, String fechaEntrada, String fechaSalida,
                        List<String> amenidades, String vista) {
        this.destino      = destino;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida  = fechaSalida;
        this.amenidades   = amenidades;
        this.vista        = vista;
    }

    String getDestino()            { return destino; }
    String getFechaEntrada()       { return fechaEntrada; }
    String getFechaSalida()        { return fechaSalida; }
    List<String> getAmenidades()   { return amenidades; }
    String getVista()              { return vista; }
}