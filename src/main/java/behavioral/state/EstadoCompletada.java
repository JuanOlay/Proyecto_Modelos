package behavioral.state;

public class EstadoCompletada implements EstadoReserva {
    @Override
    public void confirmar(Reserva reserva)   { throw new IllegalStateException("La reserva ya fue completada."); }
    @Override
    public void cancelar(Reserva reserva)    { throw new IllegalStateException("No se puede cancelar una reserva completada."); }
    @Override
    public void completar(Reserva reserva)   { throw new IllegalStateException("La reserva ya fue completada."); }
    @Override
    public void dejarResena(Reserva reserva) { System.out.println("[Reseña] Reseña registrada para la reserva de " + reserva.getHuesped()); }
    @Override
    public String getNombre()                { return "COMPLETADA"; }
}
