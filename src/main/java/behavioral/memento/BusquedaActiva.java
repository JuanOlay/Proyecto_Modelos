package behavioral.memento;

import java.util.List;

public class BusquedaActiva {
    private String       destino;
    private String       fechaEntrada;
    private String       fechaSalida;
    private List<String> amenidades;
    private String       vista;

    public void setEstado(String destino, String fechaEntrada, String fechaSalida,
                          List<String> amenidades, String vista) {
        this.destino      = destino;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida  = fechaSalida;
        this.amenidades   = amenidades;
        this.vista        = vista;
    }

    public InstantaneaBusqueda guardar() {
        return new InstantaneaBusqueda(destino, fechaEntrada, fechaSalida, amenidades, vista);
    }

    public void restaurar(InstantaneaBusqueda instantanea) {
        this.destino      = instantanea.getDestino();
        this.fechaEntrada = instantanea.getFechaEntrada();
        this.fechaSalida  = instantanea.getFechaSalida();
        this.amenidades   = instantanea.getAmenidades();
        this.vista        = instantanea.getVista();
    }

    public String getDestino()            { return destino; }
    public String getFechaEntrada()       { return fechaEntrada; }
    public String getFechaSalida()        { return fechaSalida; }
    public List<String> getAmenidades()   { return amenidades; }
    public String getVista()              { return vista; }
}
