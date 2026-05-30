package structural.decorator;

public class DecoradorKitBienvenida extends DecoradorReserva {
    public DecoradorKitBienvenida(Reserva reserva) { super(reserva); }

    @Override
    public String getDescripcion() { return reserva.getDescripcion() + " + Kit de bienvenida"; }

    @Override
    public double getPrecio() { return reserva.getPrecio() + 15.0; }
}
