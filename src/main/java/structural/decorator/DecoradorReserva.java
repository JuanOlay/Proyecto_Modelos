package structural.decorator;

public abstract class DecoradorReserva implements Reserva {
    protected final Reserva reserva;

    public DecoradorReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
