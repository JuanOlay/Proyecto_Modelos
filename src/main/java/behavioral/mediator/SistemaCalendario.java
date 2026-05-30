package behavioral.mediator;

public class SistemaCalendario extends Participante {

    public SistemaCalendario(CentralMensajeria mediador) {
        super(mediador);
    }

    @Override public String getNombre()              { return "SistemaCalendario"; }
    @Override public void recibir(String mensaje)    { System.out.println("[Calendario] " + mensaje); }
}
