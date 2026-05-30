package behavioral.state;

public class Reserva {
    private final String huesped;
    private final String propiedad;
    private EstadoReserva estado;

    public Reserva(String huesped, String propiedad) {
        this.huesped    = huesped;
        this.propiedad  = propiedad;
        this.estado     = new EstadoSolicitada();
    }

    public void setEstado(EstadoReserva estado) { this.estado = estado; }

    public void confirmar()   { estado.confirmar(this); }
    public void cancelar()    { estado.cancelar(this); }
    public void completar()   { estado.completar(this); }
    public void dejarResena() { estado.dejarResena(this); }

    public String getHuesped()    { return huesped; }
    public String getPropiedad()  { return propiedad; }
    public String getEstado()     { return estado.getNombre(); }
}
