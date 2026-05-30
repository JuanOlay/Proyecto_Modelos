package behavioral.mediator;

public class CentralMensajeria {
    private Huesped          huesped;
    private Anfitrion        anfitrion;
    private SistemaReservas  reservas;
    private SistemaCalendario calendario;
    private SistemaTickets   tickets;

    public void registrar(Huesped h, Anfitrion a, SistemaReservas r,
                          SistemaCalendario c, SistemaTickets t) {
        this.huesped    = h;
        this.anfitrion  = a;
        this.reservas   = r;
        this.calendario = c;
        this.tickets    = t;
    }

    public void gestionar(Participante emisor, String mensaje) {
        System.out.println("\n[Central] Mensaje de " + emisor.getNombre() + ": \"" + mensaje + "\"");

        if (emisor instanceof Huesped) {
            anfitrion.recibir(mensaje);
            if (mensaje.toLowerCase().contains("disponibilidad"))
                calendario.recibir("Verificando fechas por consulta de " + emisor.getNombre());
            if (mensaje.toLowerCase().contains("problema"))
                tickets.recibir("Ticket abierto por reporte de " + emisor.getNombre());
        }

        if (emisor instanceof Anfitrion) {
            huesped.recibir(mensaje);
            if (mensaje.toLowerCase().contains("confirmado"))
                reservas.recibir("Actualizando estado de reserva a CONFIRMADA");
            if (mensaje.toLowerCase().contains("disponibilidad"))
                calendario.recibir("Consultando disponibilidad solicitada por " + emisor.getNombre());
        }
    }
}