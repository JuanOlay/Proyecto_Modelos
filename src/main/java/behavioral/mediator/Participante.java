package behavioral.mediator;

public abstract class Participante {
    protected CentralMensajeria mediador;

    public Participante(CentralMensajeria mediador) {
        this.mediador = mediador;
    }

    public abstract String getNombre();
    public abstract void recibir(String mensaje);
}
