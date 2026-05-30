package behavioral.state;

public interface EstadoReserva {
    void confirmar(Reserva reserva);
    void cancelar(Reserva reserva);
    void completar(Reserva reserva);
    void dejarResena(Reserva reserva);
    String getNombre();
}
