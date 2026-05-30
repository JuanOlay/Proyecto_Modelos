package behavioral.state;

public class EstadoSolicitada implements EstadoReserva {
    @Override
    public void confirmar(Reserva reserva)   { reserva.setEstado(new EstadoConfirmada()); }
    @Override
    public void cancelar(Reserva reserva)    { reserva.setEstado(new EstadoCancelada()); }
    @Override
    public void completar(Reserva reserva)   { throw new IllegalStateException("No se puede completar una reserva solicitada."); }
    @Override
    public void dejarResena(Reserva reserva) { throw new IllegalStateException("No se puede reseñar una reserva solicitada."); }
    @Override
    public String getNombre()                { return "SOLICITADA"; }
}
