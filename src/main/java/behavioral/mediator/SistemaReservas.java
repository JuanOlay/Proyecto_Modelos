package behavioral.mediator;

public class SistemaReservas extends Participante {

    public SistemaReservas(CentralMensajeria mediador) {
        super(mediador);
    }

    @Override public String getNombre()              { return "SistemaReservas"; }
    @Override public void recibir(String mensaje)    { System.out.println("[Reservas] " + mensaje); }
}
