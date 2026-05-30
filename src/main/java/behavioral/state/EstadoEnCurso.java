package behavioral.state;

public class EstadoEnCurso implements EstadoReserva {
    @Override
    public void confirmar(Reserva reserva)   { throw new IllegalStateException("La reserva ya está en curso."); }
    @Override
    public void cancelar(Reserva reserva)    { throw new IllegalStateException("No se puede cancelar una reserva en curso."); }
    @Override
    public void completar(Reserva reserva)   { reserva.setEstado(new EstadoCompletada()); }
    @Override
    public void dejarResena(Reserva reserva) { throw new IllegalStateException("Debe completarse antes de reseñar."); }
    @Override
    public String getNombre()                { return "EN CURSO"; }
}
