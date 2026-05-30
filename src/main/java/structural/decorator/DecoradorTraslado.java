package structural.decorator;

public class DecoradorTraslado extends DecoradorReserva {
    public DecoradorTraslado(Reserva reserva) { super(reserva); }

    @Override
    public String getDescripcion() { return reserva.getDescripcion() + " + Traslado aeropuerto"; }

    @Override
    public double getPrecio() { return reserva.getPrecio() + 40.0; }
}
