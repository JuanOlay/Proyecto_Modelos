package structural.decorator;

public class DecoradorSeguro extends DecoradorReserva {
    public DecoradorSeguro(Reserva reserva) { super(reserva); }

    @Override
    public String getDescripcion() { return reserva.getDescripcion() + " + Seguro de viaje"; }

    @Override
    public double getPrecio() { return reserva.getPrecio() + 25.0; }
}
