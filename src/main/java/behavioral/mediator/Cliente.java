package behavioral.mediator;

public class Cliente {
    private final CentralMensajeria central = new CentralMensajeria();

    public CentralMensajeria getCentral() {
        return central;
    }

    public void huespedEnvia(Huesped huesped, String mensaje) {
        huesped.enviar(mensaje);
    }

    public void anfitrionEnvia(Anfitrion anfitrion, String mensaje) {
        anfitrion.enviar(mensaje);
    }
}
