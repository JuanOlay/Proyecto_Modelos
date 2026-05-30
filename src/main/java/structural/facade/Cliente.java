package structural.facade;

public class Cliente {
    private final ServicioReserva servicioReserva = new ServicioReserva();

    public void confirmar(String propiedad, String anfitrion, String huesped,
                          String fechaEntrada, String fechaSalida, double monto) {
        String contrato = servicioReserva.confirmarReserva(
                propiedad, anfitrion, huesped, fechaEntrada, fechaSalida, monto);
        System.out.println("Reserva confirmada. Contrato: " + contrato);
    }
}
