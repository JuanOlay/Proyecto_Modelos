package structural.proxy;

public class ProxyPerfilAnfitrion implements PerfilAnfitrion {
    private final PerfilAnfitrionReal perfilReal;
    private final EstadoReserva       estadoReserva;

    public ProxyPerfilAnfitrion(PerfilAnfitrionReal perfilReal, EstadoReserva estadoReserva) {
        this.perfilReal   = perfilReal;
        this.estadoReserva = estadoReserva;
    }

    @Override
    public String getNombre() {
        return perfilReal.getNombre();
    }

    @Override
    public String getTelefono() {
        if (estadoReserva == EstadoReserva.CONFIRMADA)
            return perfilReal.getTelefono();
        return "+** *** ***" + perfilReal.getTelefono().substring(perfilReal.getTelefono().length() - 2);
    }

    @Override
    public String getDireccion() {
        if (estadoReserva == EstadoReserva.CONFIRMADA)
            return perfilReal.getDireccion();
        return "Eixample, Barcelona";
    }
}
