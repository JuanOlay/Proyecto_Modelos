package behavioral.state;

public class EstadoConfirmada implements EstadoReserva {
    @Override
    public void confirmar(Reserva reserva)   { throw new IllegalStateException("La reserva ya está confirmada."); }
    @Override
    public void cancelar(Reserva reserva)    { reserva.setEstado(new EstadoCancelada()); }
    @Override
    public void completar(Reserva reserva)   { reserva.setEstado(new EstadoEnCurso()); }
    @Override
    public void dejarResena(Reserva reserva) { throw new IllegalStateException("La reserva aún no ha concluido."); }
    @Override
    public String getNombre()                { return "CONFIRMADA"; }
}
