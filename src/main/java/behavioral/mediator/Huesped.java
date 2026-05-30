package behavioral.mediator;

public class Huesped extends Participante {
    private final String nombre;

    public Huesped(String nombre, CentralMensajeria mediador) {
        super(mediador);
        this.nombre = nombre;
    }

    public void enviar(String mensaje) {
        mediador.gestionar(this, mensaje);
    }

    @Override public String getNombre()              { return nombre; }
    @Override public void recibir(String mensaje)    { System.out.println("[Huésped - " + nombre + "] " + mensaje); }
}
