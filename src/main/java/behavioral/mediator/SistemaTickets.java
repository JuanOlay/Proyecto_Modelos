package behavioral.mediator;

public class SistemaTickets extends Participante {

    public SistemaTickets(CentralMensajeria mediador) {
        super(mediador);
    }

    @Override public String getNombre()              { return "SistemaTickets"; }
    @Override public void recibir(String mensaje)    { System.out.println("[Soporte] " + mensaje); }
}
