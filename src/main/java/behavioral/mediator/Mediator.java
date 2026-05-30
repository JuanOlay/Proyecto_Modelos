package behavioral.mediator;

public class Mediator {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        CentralMensajeria central = cliente.getCentral();

        Huesped           maria    = new Huesped("María", central);
        Anfitrion         carlos   = new Anfitrion("Carlos", central);
        SistemaReservas   reservas = new SistemaReservas(central);
        SistemaCalendario cal      = new SistemaCalendario(central);
        SistemaTickets    tickets  = new SistemaTickets(central);

        central.registrar(maria, carlos, reservas, cal, tickets);

        cliente.huespedEnvia(maria,  "Hola, quisiera consultar disponibilidad para agosto.");
        cliente.anfitrionEnvia(carlos, "¡Hola! El apartamento está confirmado para esas fechas.");
        cliente.huespedEnvia(maria,  "Hay un problema con el acceso al edificio.");
    }
}
