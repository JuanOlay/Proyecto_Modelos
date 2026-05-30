package behavioral.state;

public class EstadoCancelada implements EstadoReserva {
    @Override
    public void confirmar(Reserva reserva)   { throw new IllegalStateException("No se puede confirmar una reserva cancelada."); }
    @Override
    public void cancelar(Reserva reserva)    { throw new IllegalStateException("La reserva ya está cancelada."); }
    @Override
    public void completar(Reserva reserva)   { throw new IllegalStateException("No se puede completar una reserva cancelada."); }
    @Override
    public void dejarResena(Reserva reserva) { throw new IllegalStateException("No se puede reseñar una reserva cancelada."); }
    @Override
    public String getNombre()                { return "CANCELADA"; }
}
